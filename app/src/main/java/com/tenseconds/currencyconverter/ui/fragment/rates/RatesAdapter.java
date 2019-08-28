package com.tenseconds.currencyconverter.ui.fragment.rates;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;
import com.google.android.material.textview.MaterialTextView;
import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;

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
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency_rates, parent, false);
        return new CurrencyViewHolder(rootView);
    }


    public class CurrencyViewHolder extends MjolnirViewHolder<Currency> {
        private final AppCompatImageView flag;
        private final AppCompatTextView currencyCode;
        private final AppCompatTextView currencyName;
        private final MaterialTextView textView;

        public CurrencyViewHolder(View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            currencyCode = itemView.findViewById(R.id.currency_code);
            currencyName = itemView.findViewById(R.id.currency_name);
            textView = itemView.findViewById(R.id.textView);

        }

        @SuppressLint("CheckResult")
        @Override
        protected void bind(Currency currency, int position, List<Object> payloads) {
            Glide
                    .with(flag.getContext())
                    .load(currency.getFlagRes())
                    .into(flag);
            currencyCode.setText(currency.getCurrencyCode());
            currencyName.setText(getContext().getString(currency.getCurrencyNameRes()));
            textView.setText(currency.getRateFormat());



        }


    }
}
