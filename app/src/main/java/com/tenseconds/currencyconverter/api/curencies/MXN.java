package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class MXN extends Currency {
    private static MXN INSTANCE;
    private MXN() {

    }

    public static synchronized MXN getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MXN();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.MXN;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_mexico;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.MXN;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.mxn;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.MXN;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.MXN;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.MXN;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.MXN;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.MXN;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.MXN;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.MXN;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.MXN;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.MXN;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.MXN;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.MXN;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.MXN;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.MXN;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.MXN;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.MXN;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.MXN;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.MXN;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.MXN;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.MXN;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.MXN;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.MXN;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.MXN;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.MXN;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.MXN;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.MXN;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.MXN;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.MXN;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.MXN;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.MXN;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.MXN;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.MXN;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.MXN;
        Currency.rates.MXN = 1;
        return Currency.rates;
    }


}
