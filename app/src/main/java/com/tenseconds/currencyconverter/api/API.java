package com.tenseconds.currencyconverter.api;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public class API {
    public static final String BASE_URL = "https://revolut.duckdns.org/";

    //url paths
    public static final String API = "latest";
    private static final String BASE_CURRENCY = "base";

    public interface Repository {
        @GET(API)
        Observable<DataSource> getRates(@Query(BASE_CURRENCY) String baseCurrency);
    }

}