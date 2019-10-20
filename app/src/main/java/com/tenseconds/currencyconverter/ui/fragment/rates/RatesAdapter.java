package com.tenseconds.currencyconverter.ui.fragment.rates;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.bumptech.glide.Glide;
import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.databinding.ItemCurrencyRatesBinding;

import java.util.Collections;
import java.util.List;

import co.infinum.mjolnirrecyclerview.MjolnirRecyclerAdapter;
import co.infinum.mjolnirrecyclerview.MjolnirViewHolder;

public class RatesAdapter extends MjolnirRecyclerAdapter<Currency> {
    public RatesAdapter(Context context) {
        super(context, Collections.emptyList());
    }

    @Override
    protected MjolnirViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        ItemCurrencyRatesBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_currency_rates, parent, false);
        return new CurrencyViewHolder(binding);
    }


    public class CurrencyViewHolder extends MjolnirViewHolder<Currency> {
        private final ItemCurrencyRatesBinding binding;

        public CurrencyViewHolder(ItemCurrencyRatesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }

        @SuppressLint("CheckResult")
        @Override
        protected void bind(Currency currency, int position, List<Object> payloads) {
            Glide
                    .with(binding.flag.getContext())
                    .load(currency.getFlagRes())
                    .into(binding.flag);
            binding.currencyCode.setText(currency.getCurrencyCode());
            binding.currencyName.setText(getContext().getString(currency.getCurrencyNameRes()));
            binding.textView.setText(currency.getRateFormat());


        }
    }
}
