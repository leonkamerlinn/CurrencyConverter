package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class NZD extends Currency {
    private static NZD INSTANCE;
    public NZD() {

    }

    public static synchronized NZD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NZD();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.NZD;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_new_zealand;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.NZD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.nzd;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.NZD;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.NZD;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.NZD;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.NZD;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.NZD;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.NZD;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.NZD;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.NZD;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.NZD;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.NZD;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.NZD;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.NZD;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.NZD;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.NZD;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.NZD;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.NZD;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.NZD;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.NZD;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.NZD;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.NZD;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.NZD;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.NZD;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.NZD;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.NZD;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.NZD;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.NZD;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.NZD;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.NZD;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.NZD;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.NZD;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.NZD;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.NZD;
        Currency.rates.NZD = 1;
        return Currency.rates;
    }


}
