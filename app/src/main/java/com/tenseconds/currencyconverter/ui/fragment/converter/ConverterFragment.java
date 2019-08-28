package com.tenseconds.currencyconverter.ui.fragment.converter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.databinding.FragmentConverterBinding;
import com.tenseconds.currencyconverter.helper.CurrencyDiffUtilCallback;
import com.tenseconds.currencyconverter.ui.activity.main.MainActivity;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;


public class ConverterFragment extends Fragment {
    public static final String TAG = ConverterFragment.class.getSimpleName();

    private FragmentConverterBinding binding;
    private MainActivity mainActivity;
    private ConverterAdapter adapter;


    public ConverterFragment() {
        // Required empty public constructor

    }


    public static ConverterFragment newInstance() {
        ConverterFragment fragment = new ConverterFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint({"ClickableViewAccessibility", "CheckResult"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_converter, container, false);
        binding.setViewModel(mainActivity.getViewModel());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ConverterAdapter(getContext());
        binding.recyclerView.setAdapter(adapter);

        mainActivity.getViewModel().getCurrencies().observe(getViewLifecycleOwner(), iCurrencies -> {
            CurrencyDiffUtilCallback diffUtil = new CurrencyDiffUtilCallback(iCurrencies, new ArrayList<>(adapter.getAll()));
            adapter.update(iCurrencies, null);

        });


        adapter.getCurrencyObservable().observeOn(AndroidSchedulers.mainThread()).subscribe(currencyViewHolder -> {
           mainActivity.getViewModel().setCurrencyCode(currencyViewHolder.getCurrencyCode());
        });

        mainActivity.getViewModel().getUpdateObservale().subscribe(adapter);


        swapCurrencyOnClick(adapter);


        return binding.getRoot();
    }

    @SuppressLint("CheckResult")
    private void swapCurrencyOnClick(ConverterAdapter adapter) {
        adapter.getPositionObservable().subscribe(index -> {
            mainActivity.getViewModel().swap(index);

        });
    }


}
