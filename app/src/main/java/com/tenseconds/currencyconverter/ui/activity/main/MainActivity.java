package com.tenseconds.currencyconverter.ui.activity.main;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.data.DataRepository;
import com.tenseconds.currencyconverter.databinding.ActivityMainBinding;
import com.tenseconds.currencyconverter.helper.ViewPagerAdapterHelper;
import com.tenseconds.currencyconverter.ui.fragment.converter.ConverterAdapter;
import com.tenseconds.currencyconverter.ui.fragment.converter.ConverterFragment;
import com.tenseconds.currencyconverter.ui.fragment.rates.RatesFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {


    @Inject
    MainViewModel viewModel;

    @Inject
    ActivityMainBinding binding;

    @Inject
    DataRepository repository;



    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        toolbarSetup();
        setupViewPager(binding.viewPagerBottom, binding.tabs);
        showSnackBarIfNoInternet();
    }

    private void toolbarSetup() {
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowCustomEnabled(true); // enable overriding the default toolbar layout
        getSupportActionBar().setDisplayShowTitleEnabled(false); // disable the default ti
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(ConverterAdapter.onChangeActionEvent event) {
        if (event.getAction() == ConverterAdapter.Action.ITEM_CHANGE_FOCUS) {
            repository.swap(event.getCurrencyItem());
        } else {
            repository.changeAmount(event.getCurrencyItem());
        }

    }


    private void showSnackBarIfNoInternet() {
        Snackbar snackbar = Snackbar
                .make(binding.getRoot(), "No internet connection", Snackbar.LENGTH_INDEFINITE);

        viewModel.showSnackBar().observe(this, show -> {
            if (show && !snackbar.isShown()) {
                snackbar.show();
            } else if (!show && snackbar.isShown()) {
                snackbar.dismiss();
            }

        });

    }



    private void setupViewPager(ViewPager2 viewPager, TabLayout tabLayout) {
        ViewPagerAdapterHelper adapter = new ViewPagerAdapterHelper(getSupportFragmentManager(), getLifecycle());
        adapter.fragmentList.add(RatesFragment.newInstance());
        adapter.fragmentList.add(ConverterFragment.newInstance());

        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPager.setAdapter(adapter);


        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager, true, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText(R.string.all_rates);
                    break;
                case 1:
                    tab.setText(R.string.converter);
                    break;
            }
        });

        tabLayoutMediator.attach();

    }



    public MainViewModel getViewModel() {
        return viewModel;
    }



    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
