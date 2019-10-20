package com.tenseconds.currencyconverter.ui.fragment.rates;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.databinding.FragmentRatesBinding;
import com.tenseconds.currencyconverter.helper.CurrencyDiffUtilCallback;
import com.tenseconds.currencyconverter.ui.activity.main.MainActivity;

import java.util.ArrayList;
import java.util.List;


public class RatesFragment extends Fragment {
    public static final String TAG = RatesFragment.class.getSimpleName();
    private MainActivity mainActivity;
    private FragmentRatesBinding binding;

    public RatesFragment() {
    }


    public static RatesFragment newInstance() {
        RatesFragment fragment = new RatesFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        mainActivity = (MainActivity) getActivity();


        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rates, container, false);
        binding.setViewModel(mainActivity.getViewModel());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RatesAdapter adapter = new RatesAdapter(getContext());
        binding.recyclerView.setAdapter(adapter);

        mainActivity.getViewModel().getCurrencyList().observe(getViewLifecycleOwner(), newList -> {
            List<Currency> oldList = new ArrayList<>(adapter.getAll());

            if (oldList.size() == 0) {
                adapter.addAll(newList);
            } else {
                CurrencyDiffUtilCallback diffUtil = new CurrencyDiffUtilCallback(newList, oldList);
                adapter.update(newList, diffUtil);
            }

        });




        return binding.getRoot();
    }




}
