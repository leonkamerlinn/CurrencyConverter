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
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.databinding.FragmentConverterBinding;
import com.tenseconds.currencyconverter.helper.CurrencyDiffUtilCallback;
import com.tenseconds.currencyconverter.ui.activity.main.MainActivity;

import java.util.ArrayList;
import java.util.List;


public class ConverterFragment extends Fragment {
    public static final String TAG = ConverterFragment.class.getSimpleName();

    private FragmentConverterBinding binding;
    private MainActivity mainActivity;
    private ConverterAdapter adapter;


    public ConverterFragment() {

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
