package com.tenseconds.currencyconverter.ui.activity.main;

import android.app.Activity;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;


import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.databinding.ActivityMainBinding;
import com.tenseconds.currencyconverter.di.scope.ActivityScoped;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class MainActivityModule {

    @Binds
    abstract Activity provideActivity(MainActivity mainActivity);

    @Provides
    @ActivityScoped
    static MainViewModel provideMainViewModel(MainActivity activity,  MainViewModelFactory factory) {
        return ViewModelProviders.of(activity, factory).get(MainViewModel.class);

    }

    @Provides
    @ActivityScoped
    static ActivityMainBinding provideViewBinding(MainActivity activity, MainViewModel viewModel) {
        ActivityMainBinding binding = DataBindingUtil.setContentView(activity, R.layout.activity_main);
        binding.setLifecycleOwner(activity);
        binding.setViewModel(viewModel);

        return binding;
    }




}