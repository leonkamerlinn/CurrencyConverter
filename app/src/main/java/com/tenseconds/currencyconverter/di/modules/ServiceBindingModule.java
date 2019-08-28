package com.tenseconds.currencyconverter.di.modules;



import com.tenseconds.currencyconverter.db.CurrencyService;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ServiceBindingModule {
    @ContributesAndroidInjector()
    abstract CurrencyService currencyService();

}
