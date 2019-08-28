package com.tenseconds.currencyconverter.db;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.Nullable;

import com.tenseconds.currencyconverter.api.CurrencyRates;

import javax.inject.Inject;

import dagger.android.DaggerIntentService;

public class CurrencyService extends DaggerIntentService {
    private static final String TAG = CurrencyService.class.getSimpleName();
    //Intent actions
    private static final String ACTION_UPDATE = TAG + ".UPDATE";

    // Intent extras
    private static final String EXTRA_TASK = "extra_task";


    @Inject
    CurrencyDatabase database;


    public CurrencyService() {
        super(TAG);
    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if (intent == null) return;
        String action = intent.getAction();

        if (ACTION_UPDATE.equals(action)) {
            handleUpdate(intent);
        }

    }



    @Override
    public void onCreate() {
        super.onCreate();
    }


    private void handleUpdate(Intent intent) {
        CurrencyRates currencyRates = intent.getParcelableExtra(EXTRA_TASK);
        database.currencyRatesDao().update(currencyRates);
    }


    public static void update(Context context, CurrencyRates rates) {
        Intent intent = new Intent(context, CurrencyService.class);
        intent.setAction(ACTION_UPDATE);
        intent.putExtra(EXTRA_TASK, rates);
        context.startService(intent);
    }









}
