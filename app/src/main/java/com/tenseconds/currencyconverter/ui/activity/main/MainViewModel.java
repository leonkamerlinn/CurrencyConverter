package com.tenseconds.currencyconverter.ui.activity.main;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyFactory;
import com.tenseconds.currencyconverter.data.Repository;
import com.tenseconds.currencyconverter.ui.fragment.converter.ConverterFragment;
import com.tenseconds.currencyconverter.ui.fragment.rates.RatesFragment;

import java.util.Collections;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;

public class MainViewModel extends AndroidViewModel {
    private final RatesFragment mRatesFragment;
    private final ConverterFragment mConverterFragment;
    private int mCounter = 0;
    private MutableLiveData<List<Currency>> mCurrencies = new MutableLiveData<>();
    private String mCurrencyCode = Currency.EUR;

    private ReplaySubject<Boolean> mBooleanReplaySubject = ReplaySubject.create();


    @SuppressLint("CheckResult")
    public MainViewModel(@NonNull Application application, Repository repository) {
        super(application);

        List<Currency> currencyList = Currency.getCurrencyList();


        mRatesFragment = RatesFragment.newInstance();
        mConverterFragment = ConverterFragment.newInstance();


        repository.getCurrencyRatesObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(currencyRates -> {

                    Currency.rates = currencyRates;
                    Currency.base = Currency.EUR;

                    Currency currency = CurrencyFactory.getCurrency(mCurrencyCode);
                    Currency.rates = currency.getRates();
                    Currency.base = currency.getCurrencyCode();

                    if (mCounter == 0) {
                        setCurrencies(currencyList);
                    } else {
                       mBooleanReplaySubject.onNext(true);
                    }



                    mCounter++;
                });
    }

    public Observable<Boolean> getUpdateObservale() {
        return mBooleanReplaySubject;
    }

    public LiveData<List<Currency>> getCurrencies() {
        return mCurrencies;
    }

    public void setCurrencyCode(String currencyCode) {
        mCurrencyCode = currencyCode;
    }

    public void setCurrencies(List<Currency> currencyList) {
        mCurrencies.setValue(currencyList);
    }

    public void swap(int index) {

        List<Currency> currencyList = getCurrencies().getValue();


        Currency currency = currencyList.get(index);
        Currency.amount = currency.getValue();
        Currency.base = currency.getCurrencyCode();
        Currency.rates = currency.getRates();
        Collections.swap(currencyList, 0, index);
        setCurrencies(currencyList);
    }

    public ConverterFragment getConverterFragment() {
        return mConverterFragment;
    }

    public RatesFragment getRatesFragment() {
        return mRatesFragment;
    }
}
