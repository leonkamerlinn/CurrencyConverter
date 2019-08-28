package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class ISK extends Currency {
    private static ISK INSTANCE;
    public ISK() {

    }

    public static synchronized ISK getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ISK();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.ISK;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_iceland;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.ISK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.isk;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.ISK;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.ISK;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.ISK;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.ISK;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.ISK;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.ISK;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.ISK;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.ISK;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.ISK;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.ISK;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.ISK;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.ISK;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.ISK;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.ISK;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.ISK;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.ISK;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.ISK;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.ISK;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.ISK;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.ISK;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.ISK;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.ISK;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.ISK;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.ISK;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.ISK;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.ISK;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.ISK;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.ISK;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.ISK;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.ISK;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.ISK;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.ISK;
        Currency.rates.ISK = 1;
        return Currency.rates;
    }


}
