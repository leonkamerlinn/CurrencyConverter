package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class RON extends Currency {
    private static RON INSTANCE;
    public RON() {

    }

    public static synchronized RON getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RON();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.RON;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_romania;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.RON;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.ron;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.RON;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.RON;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.RON;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.RON;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.RON;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.RON;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.RON;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.RON;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.RON;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.RON;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.RON;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.RON;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.RON;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.RON;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.RON;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.RON;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.RON;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.RON;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.RON;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.RON;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.RON;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.RON;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.RON;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.RON;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.RON;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.RON;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.RON;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.RON;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.RON;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.RON;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.RON;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.RON;
        Currency.rates.RON = 1;
        return Currency.rates;
    }


}
