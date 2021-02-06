package com.tenseconds.currencyconverter.data;

import android.annotation.SuppressLint;
import android.net.NetworkInfo;

import com.github.pwittchen.reactivenetwork.library.rx2.Connectivity;
import com.github.pwittchen.reactivenetwork.library.rx2.ConnectivityPredicate;
import com.tenseconds.currencyconverter.api.API;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;
import com.tenseconds.currencyconverter.api.curencies.AUD;
import com.tenseconds.currencyconverter.api.curencies.BGN;
import com.tenseconds.currencyconverter.api.curencies.BRL;
import com.tenseconds.currencyconverter.api.curencies.CAD;
import com.tenseconds.currencyconverter.api.curencies.CHF;
import com.tenseconds.currencyconverter.api.curencies.CNY;
import com.tenseconds.currencyconverter.api.curencies.CZK;
import com.tenseconds.currencyconverter.api.curencies.DKK;
import com.tenseconds.currencyconverter.api.curencies.EUR;
import com.tenseconds.currencyconverter.api.curencies.GBP;
import com.tenseconds.currencyconverter.api.curencies.HKD;
import com.tenseconds.currencyconverter.api.curencies.HRK;
import com.tenseconds.currencyconverter.api.curencies.HUF;
import com.tenseconds.currencyconverter.api.curencies.IDR;
import com.tenseconds.currencyconverter.api.curencies.ILS;
import com.tenseconds.currencyconverter.api.curencies.INR;
import com.tenseconds.currencyconverter.api.curencies.ISK;
import com.tenseconds.currencyconverter.api.curencies.JPY;
import com.tenseconds.currencyconverter.api.curencies.KRW;
import com.tenseconds.currencyconverter.api.curencies.MXN;
import com.tenseconds.currencyconverter.api.curencies.MYR;
import com.tenseconds.currencyconverter.api.curencies.NOK;
import com.tenseconds.currencyconverter.api.curencies.NZD;
import com.tenseconds.currencyconverter.api.curencies.PHP;
import com.tenseconds.currencyconverter.api.curencies.PLN;
import com.tenseconds.currencyconverter.api.curencies.RON;
import com.tenseconds.currencyconverter.api.curencies.RUB;
import com.tenseconds.currencyconverter.api.curencies.SEK;
import com.tenseconds.currencyconverter.api.curencies.SGD;
import com.tenseconds.currencyconverter.api.curencies.THB;
import com.tenseconds.currencyconverter.api.curencies.TRY;
import com.tenseconds.currencyconverter.api.curencies.USD;
import com.tenseconds.currencyconverter.api.curencies.ZAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.ReplaySubject;

@SuppressLint("CheckResult")
@Singleton
public class DataRepository {
    private final API.Repository mApi;
    private final Observable<Boolean> mConnectivityObservable;
    private Disposable mDisposable;
    private final CurrencyState mCurrencyState = new CurrencyState();
    private final ReplaySubject<CurrencyState> mCurrencyStateReplaySubject = ReplaySubject.create();
    public Observable<CurrencyState> getCurrencyState() {
        return mCurrencyStateReplaySubject;
    }



    @Inject
    public DataRepository(API.Repository api, Observable<Connectivity> connectivityObservable) {
        mApi = api;
        mConnectivityObservable = connectivityObservable
                .filter(ConnectivityPredicate.hasState(NetworkInfo.State.CONNECTED))
                .map(connectivity -> true);

        handleNetwork(api, Currency.EUR);
    }

    private void handleNetwork(API.Repository api, String base) {
        dispose();
        mDisposable = api.getRates(base)

                .repeatWhen(objectObservable -> objectObservable.delay(1, TimeUnit.SECONDS))
                .retryWhen(throwableObservable -> {
                    throwableObservable.subscribe(throwable -> {
                        mCurrencyState.error = throwable;
                        mCurrencyStateReplaySubject.onNext(mCurrencyState);
                    });
                    return mConnectivityObservable;
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(data -> {
                    mCurrencyState.data = data;
                    mCurrencyState.error = null;
                    mCurrencyState.converterList = DataRepository.getCurrencyList(data, mCurrencyState.currencyItem);
                    mCurrencyState.ratesList = DataRepository.getCurrencyList(data, null);

                    mCurrencyStateReplaySubject.onNext(mCurrencyState);
                }, err -> {
                    mCurrencyState.error = err;
                    mCurrencyStateReplaySubject.onNext(mCurrencyState);
                });
    }

    private void dispose() {
        if (mDisposable != null && !mDisposable.isDisposed()) mDisposable.dispose();
    }

    public void swap(Currency currency) {
        if (currency == null)return;
        mCurrencyState.currencyItem = currency;
        mCurrencyState.converterList = getCurrencyList(mCurrencyState.data, currency);
        mCurrencyStateReplaySubject.onNext(mCurrencyState);
        handleNetwork(mApi, currency.getCurrencyCode());
    }

    public void changeAmount(Currency currency) {
        mCurrencyState.currencyItem = currency;
        mCurrencyState.converterList = DataRepository.getCurrencyList(mCurrencyState.data, currency);
        mCurrencyStateReplaySubject.onNext(mCurrencyState);
    }


    public class CurrencyState {
        private DataSource data;

        private Currency currencyItem;
        public Throwable error;
        public List<Currency> converterList = DataRepository.getCurrencyList(getDefaultData(), null);
        public List<Currency> ratesList = DataRepository.getCurrencyList(getDefaultData(), null);

    }




    public static List<Currency> getCurrencyList(DataSource data, Currency currencyItem) {
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new EUR(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new AUD(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new BGN(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new BRL(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new CAD(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new CHF(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new CNY(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new CZK(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new DKK(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new GBP(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new HKD(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new HRK(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new HUF(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new IDR(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new ILS(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new INR(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new ISK(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new JPY(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new KRW(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new MXN(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new MYR(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new NOK(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new NZD(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new PHP(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new PLN(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new RON(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new RUB(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new SEK(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new SGD(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new THB(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new TRY(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new USD(data, currencyItem == null ? 100f : currencyItem.getValue()));
        currencyList.add(new ZAR(data, currencyItem == null ? 100f : currencyItem.getValue()));



        if (currencyItem != null) {
            int index = currencyList.indexOf(currencyItem);
            if (index > 0) {
                Collections.swap(currencyList, index, 0);
            }

        }


        return currencyList;
    }


    public static DataSource getDefaultData() {
        CurrencyRates currencyRates = new CurrencyRates();
        currencyRates.setAUD(1.6107f);
        currencyRates.setBGN(1.9488f);
        currencyRates.setBRL(4.7748f);
        currencyRates.setCAD(1.5283f);
        currencyRates.setCHF(1.1235f);
        currencyRates.setCNY(7.9169f);
        currencyRates.setCZK(25.624f);
        currencyRates.setDKK(7.4302f);
        currencyRates.setGBP(0.89505f);
        currencyRates.setHKD(9.0999f);
        currencyRates.setHRK(7.4077f);
        currencyRates.setHUF(325.33f);
        currencyRates.setIDR(17262f);
        currencyRates.setILS(4.1558f);
        currencyRates.setINR(83.42f);
        currencyRates.setISK(127.35f);
        currencyRates.setJPY(129.09f);
        currencyRates.setKRW(1300.1f);
        currencyRates.setMXN(22.286f);
        currencyRates.setMYR(4.7949f);
        currencyRates.setNOK(9.7412f);
        currencyRates.setNZD(1.757f);
        currencyRates.setPHP(62.369f);
        currencyRates.setPLN(4.3029f);
        currencyRates.setRON(4.622f);
        currencyRates.setRUB(79.292f);
        currencyRates.setSEK(10.553f);
        currencyRates.setSGD(1.5943f);
        currencyRates.setTHB(37.994f);
        currencyRates.setTRY(7.6011f);
        currencyRates.setUSD(1.1593f);
        currencyRates.setZAR(17.76f);
        currencyRates.setEUR(1f);
        DataSource data = new DataSource();
        data.rates = currencyRates;
        data.base = Currency.EUR;
        return data;
    }


}
