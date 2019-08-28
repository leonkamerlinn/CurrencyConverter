package com.tenseconds.currencyconverter.ui.activity.main;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.databinding.ActivityMainBinding;
import com.tenseconds.currencyconverter.ui.fragment.converter.ConverterFragment;
import com.tenseconds.currencyconverter.ui.fragment.rates.RatesFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {


    @Inject
    MainViewModel viewModel;

    @Inject
    ActivityMainBinding binding;



    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        setSupportActionBar(binding.toolbar);

        // Get the ActionBar here to configure the way it behaves.
        final ActionBar ab = getSupportActionBar();
        //ab.setHomeAsUpIndicator(R.drawable.ic_menu); // set a custom icon for the default home button
        //ab.setDisplayShowHomeEnabled(true); // show or hide the default home button
        ab.setDisplayHomeAsUpEnabled(false);
        ab.setDisplayShowCustomEnabled(true); // enable overriding the default toolbar layout
        ab.setDisplayShowTitleEnabled(false); // disable the default ti
        setupViewPager(binding.viewPagerBottom, binding.tabs);

    }




    private void setupViewPager(ViewPager2 viewPager, TabLayout tabLayout) {


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());

        adapter.fragmentList.add(viewModel.getRatesFragment());
        adapter.fragmentList.add(viewModel.getConverterFragment());

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

    class ViewPagerAdapter extends FragmentStateAdapter {


        private final List<Fragment> fragmentList = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getItemCount() {
            return fragmentList.size();
        }


    }
}
