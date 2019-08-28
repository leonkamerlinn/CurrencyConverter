package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class HKD extends Currency {
    private static HKD INSTANCE;
    public HKD() {

    }

    public static synchronized HKD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HKD();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.HKD;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_hong_kong;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.HKD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.hkd;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.HKD;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.HKD;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.HKD;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.HKD;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.HKD;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.HKD;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.HKD;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.HKD;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.HKD;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.HKD;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.HKD;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.HKD;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.HKD;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.HKD;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.HKD;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.HKD;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.HKD;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.HKD;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.HKD;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.HKD;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.HKD;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.HKD;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.HKD;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.HKD;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.HKD;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.HKD;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.HKD;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.HKD;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.HKD;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.HKD;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.HKD;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.HKD;
        Currency.rates.HKD = 1;
        return Currency.rates;
    }


}
