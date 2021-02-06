package com.tenseconds.currencyconverter.application;

import android.app.Application;

import com.tenseconds.currencyconverter.di.modules.ActivityBindingModule;
import com.tenseconds.currencyconverter.di.modules.ApplicationBindingModule;
import com.tenseconds.currencyconverter.di.modules.ServiceBindingModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Leon on 2.2.2018..
 */

@Singleton
@Component(modules = {
        ActivityBindingModule.class,
        ApplicationBindingModule.class,
        ServiceBindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface ApplicationComponent extends AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);

        ApplicationComponent build();
    }


}
