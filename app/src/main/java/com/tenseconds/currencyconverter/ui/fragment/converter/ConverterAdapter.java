package com.tenseconds.currencyconverter.ui.fragment.converter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;
import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;

import java.util.Collections;
import java.util.List;

import co.infinum.mjolnirrecyclerview.MjolnirRecyclerAdapter;
import co.infinum.mjolnirrecyclerview.MjolnirViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.ReplaySubject;

public class ConverterAdapter extends MjolnirRecyclerAdapter<Currency> implements Consumer<Boolean> {
    private final Context mContext;
    private ReplaySubject<Currency> mCurrencyReplaySubject = ReplaySubject.create();
    private ReplaySubject<Integer> mPositionReplaySubject = ReplaySubject.create();
    public static int mFocusedPosition = 0;


    public ConverterAdapter(Context context) {
        super(context, Collections.emptyList());
        mContext = context;
    }

    @Override
    protected MjolnirViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency_converter, parent, false);
        return new CurrencyViewHolder(rootView);
    }






    public Observable<Currency> getCurrencyObservable() {
        return mCurrencyReplaySubject;
    }

    public Observable<Integer> getPositionObservable() {
        return mPositionReplaySubject;
    }



    public void notifyExceptFocusedPosition() {
        if (mFocusedPosition == 0) {
            notifyItemRangeChanged(1, getItemCount()-1);
        } else if (mFocusedPosition == getItemCount() - 1) {
            notifyItemRangeChanged(0, getItemCount()-2);
        } else {
            notifyItemRangeChanged(0, mFocusedPosition);
            notifyItemRangeChanged(mFocusedPosition+1, getItemCount()-1);
        }
    }

    @Override
    public void accept(Boolean aBoolean) throws Exception {
        notifyExceptFocusedPosition();

        Log.i("a", "a");
    }


    public class CurrencyViewHolder extends MjolnirViewHolder<Currency> {
        private final AppCompatImageView flag;
        private final AppCompatTextView currencyCode;
        private final AppCompatTextView currencyName;
        private final TextInputEditText editText;

        public CurrencyViewHolder(View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            currencyCode = itemView.findViewById(R.id.currency_code);
            currencyName = itemView.findViewById(R.id.currency_name);
            editText = itemView.findViewById(R.id.editText);
        }


        @SuppressLint("CheckResult")
        @Override
        protected void bind(Currency currency, int position, List<Object> payloads) {
            Glide
                    .with(flag.getContext())
                    .load(currency.getFlagRes())
                    .into(flag);
            currencyCode.setText(currency.getCurrencyCode());
            currencyName.setText(mContext.getString(currency.getCurrencyNameRes()));
            editText.setText(currency.getValueFormat());


            editText.setOnFocusChangeListener((view, b) -> {
                if (b) {
                    mFocusedPosition = getAdapterPosition();
                    mCurrencyReplaySubject.onNext(currency);
                    Currency.base = currency.getCurrencyCode();

                    Currency.rates = currency.getRates();
                } else {

                }

            });

            if (mFocusedPosition == getAdapterPosition()) {
                editText.requestFocus();

            }

            itemView.setOnClickListener(view -> {
                if (view.isPressed()) {
                    mPositionReplaySubject.onNext(getAdapterPosition());
                }
            });



            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    String value = charSequence.toString().replaceAll("\\s+","");
                    if (value.length() == 0) {
                        Currency.amount = 0;


                       notifyDataSetChanged();



                    } else {
                        float num;
                        String s2 = value.replace(",", ".");
                        try {
                            num = Float.valueOf(s2);

                        } catch (Exception e) {
                            num = 0;
                        }

                        if (Currency.amount != num && editText.isFocused() && getAdapterPosition() == mFocusedPosition && currency.getCurrencyCode().equals(Currency.base)) {
                            Currency.amount = num;

                            notifyExceptFocusedPosition();


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
