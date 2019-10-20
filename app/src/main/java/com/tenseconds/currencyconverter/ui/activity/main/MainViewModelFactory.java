package com.tenseconds.currencyconverter.ui.activity.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import com.tenseconds.currencyconverter.data.DataRepository;

import javax.inject.Inject;

public class MainViewModelFactory implements ViewModelProvider.Factory {


    private final Application mApplication;
    private final DataRepository mRepository;

    @Inject
    public MainViewModelFactory(Application application, DataRepository repository) {
       mApplication = application;
       mRepository = repository;
    }

    @NonNull
    @Override
    public MainViewModel create(Class modelClass) {
        return new MainViewModel(mApplication, mRepository);
    }
}
