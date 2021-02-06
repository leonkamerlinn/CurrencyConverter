package com.tenseconds.currencyconverter.application;


import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


public class MainApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent
                .builder()
                .application(this)
                .build();
    }


}