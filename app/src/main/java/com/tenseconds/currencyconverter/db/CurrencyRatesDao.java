package com.tenseconds.currencyconverter.db;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.tenseconds.currencyconverter.api.CurrencyRates;

import io.reactivex.Observable;

@Dao
public abstract class CurrencyRatesDao {
    @Query("SELECT * FROM currency_table WHERE ID = 1")
    public abstract Observable<CurrencyRates> getCunrrencyRatesObservable();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public abstract void insert(CurrencyRates currencyRates);

    @Update()
    public abstract void update(CurrencyRates currencyRates);
}
