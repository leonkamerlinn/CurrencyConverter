package com.tenseconds.currencyconverter.ui.activity.main;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.data.DataRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<DataRepository.CurrencyState> mCurrencyState = new MutableLiveData<>();


    @SuppressLint("CheckResult")
    public MainViewModel(@NonNull Application application, DataRepository repository) {
        super(application);

        repository.getCurrencyState()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(currencyState -> mCurrencyState.setValue(currencyState));
    }


    public LiveData<List<Currency>> getCurrencyList() {
        return Transformations.map(mCurrencyState, currencyState -> currencyState.converterList);
    }


    public LiveData<Boolean> showSnackBar() {
        return Transformations.map(mCurrencyState, currencyState -> (currencyState.error != null));
    }

}
