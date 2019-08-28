package com.tenseconds.currencyconverter.di.modules;

import android.app.Application;
import android.content.Context;

import com.github.pwittchen.reactivenetwork.library.rx2.Connectivity;
import com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork;
import com.tenseconds.currencyconverter.api.API;
import com.tenseconds.currencyconverter.db.CurrencyDatabase;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public abstract class ApplicationBindingModule {

    @Binds
    abstract Context bindContext(Application application);


    @Provides
    static String provideTag() {
        return ApplicationBindingModule.class.getSimpleName();
    }

    @Provides
    static CurrencyDatabase provideDatabase(Application application) {
        return CurrencyDatabase.getInstance(application.getApplicationContext());
    }


    @Provides
    static OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder()
                .build();
    }

    @Provides
    static Observable<Connectivity> provideNetworkObservable(Context context) {
        return ReactiveNetwork
                .observeNetworkConnectivity(context);
    }

    @Provides
    static Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();



        return retrofit;
    }

    @Provides
    static API.Repository provideMovieService(Retrofit retrofit) {
        return retrofit.create(API.Repository.class);
    }








}