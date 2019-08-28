package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class BGN extends Currency {
    private static BGN INSTANCE;
    public BGN() {

    }

    public static synchronized BGN getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BGN();
        }

        return INSTANCE;
    }




    @Override
    public float getRate() {
        return Currency.rates.BGN;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_bulgaria;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.BGN;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.bgn;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.BGN;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.BGN;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.BGN;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.BGN;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.BGN;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.BGN;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.BGN;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.BGN;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.BGN;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.BGN;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.BGN;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.BGN;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.BGN;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.BGN;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.BGN;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.BGN;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.BGN;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.BGN;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.BGN;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.BGN;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.BGN;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.BGN;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.BGN;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.BGN;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.BGN;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.BGN;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.BGN;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.BGN;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.BGN;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.BGN;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.BGN;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.BGN;
        Currency.rates.BGN = 1;
        return Currency.rates;
    }
}
