package com.tenseconds.currencyconverter.ui.fragment.converter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.bumptech.glide.Glide;
import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.databinding.ItemCurrencyConverterBinding;

import org.greenrobot.eventbus.EventBus;

import java.util.Collections;
import java.util.List;

import co.infinum.mjolnirrecyclerview.MjolnirRecyclerAdapter;
import co.infinum.mjolnirrecyclerview.MjolnirViewHolder;

public class ConverterAdapter extends MjolnirRecyclerAdapter<Currency> {
    private final Context mContext;


    public ConverterAdapter(Context context) {
        super(context, Collections.emptyList());
        mContext = context;
    }

    @Override
    protected MjolnirViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        ItemCurrencyConverterBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_currency_converter, parent, false);

        return new CurrencyViewHolder(binding);
    }


    public class CurrencyViewHolder extends MjolnirViewHolder<Currency> {
        private final ItemCurrencyConverterBinding binding;

        public CurrencyViewHolder(ItemCurrencyConverterBinding binding) {
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
            binding.currencyName.setText(mContext.getString(currency.getCurrencyNameRes()));
            binding.editText.setText(currency.getValueFormat());


            binding.editText.setOnFocusChangeListener((view, isFocused) -> {
                if (isFocused && getAdapterPosition() != 0) {
                    EventBus.getDefault().post(new onChangeActionEvent(get(getAdapterPosition()), Action.ITEM_CHANGE_FOCUS));
                }

            });

            if (getAdapterPosition() == 0) {
                binding.editText.requestFocus();
            }




            if (getAdapterPosition() == 0) {
                binding.editText.addTextChangedListener(new TextWatcher() {

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        String value = charSequence.toString().replaceAll("\\s+","");
                        float num;

                        if (value.length() == 0) {
                            binding.editText.setText("0");
                        } else {
                            String s2 = value.replace(",", ".");
                            try {
                                num = Float.valueOf(s2);

                            } catch (Exception e) {
                                num = 0;
                            }


                            Currency item = get(getAdapterPosition());
                            if (item.getAmount() != num && item.getCurrencyCode().equals(item.getBase())) {
                                item.setAmount(num);
                                EventBus.getDefault().post(new onChangeActionEvent(item, Action.ITEM_TEXT_CHANGE));

                            }


                        }





                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                });
            }




        }


    }

    public enum Action {
        ITEM_CHANGE_FOCUS,
        ITEM_TEXT_CHANGE
    }

    public static class onChangeActionEvent {
        private Action mAction;
        private Currency mCurrency;
        public onChangeActionEvent(Currency currency, Action action) {
            mCurrency = currency;
            mAction = action;
        }


        public Action getAction() {
            return mAction;
        }

        public Currency getCurrencyItem() {
            return mCurrency;
        }

    }

}
