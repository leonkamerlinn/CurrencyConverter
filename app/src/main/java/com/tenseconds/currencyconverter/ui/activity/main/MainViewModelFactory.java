package com.tenseconds.currencyconverter.ui.activity.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import com.tenseconds.currencyconverter.data.Repository;

import javax.inject.Inject;

public class MainViewModelFactory implements ViewModelProvider.Factory {


    private final Application mApplication;
    private final Repository mRepository;

    @Inject
    public MainViewModelFactory(Application application, Repository repository) {
       mApplication = application;
       mRepository = repository;
    }

    @NonNull
    @Override
    public MainViewModel create(Class modelClass) {
        return new MainViewModel(mApplication, mRepository);
    }
}
