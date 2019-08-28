package com.tenseconds.currencyconverter.di.modules;



import com.tenseconds.currencyconverter.di.scope.ActivityScoped;
import com.tenseconds.currencyconverter.ui.activity.main.MainActivity;
import com.tenseconds.currencyconverter.ui.activity.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();
}


