package com.tenseconds.currencyconverter.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.NetworkInfo;

import com.github.pwittchen.reactivenetwork.library.rx2.Connectivity;
import com.github.pwittchen.reactivenetwork.library.rx2.ConnectivityPredicate;
import com.tenseconds.currencyconverter.api.API;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.db.CurrencyDatabase;
import com.tenseconds.currencyconverter.db.CurrencyService;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;

public class Repository {


    private ReplaySubject<CurrencyRates> mCurrencyRatesReplaySubject = ReplaySubject.create();

    public Observable<CurrencyRates> getCurrencyRatesObservable() {
        return mCurrencyRatesReplaySubject;
    }

    @SuppressLint("CheckResult")
    @Inject
    public Repository(CurrencyDatabase currencyDatabase, API.Repository api, Context context, Observable<Connectivity> connectivityObservable) {




        currencyDatabase.currencyRatesDao().getCunrrencyRatesObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(currencyRates -> mCurrencyRatesReplaySubject.onNext(currencyRates));


        connectivityObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .filter(ConnectivityPredicate.hasState(NetworkInfo.State.CONNECTED))
                .subscribe(connectivity -> {
                    api.getRates(Currency.EUR)
                            .subscribeOn(Schedulers.io())
                            .observeOn(Schedulers.io())
                            .repeatWhen(objectObservable -> objectObservable.delay(1, TimeUnit.SECONDS))
                            .subscribe(dataResponse -> CurrencyService.update(context, dataResponse.rates), err -> {
                                System.out.println(err.getMessage());
                            });
                });

    }
}
