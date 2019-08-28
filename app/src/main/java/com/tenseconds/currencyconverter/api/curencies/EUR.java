package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class EUR extends Currency {
    private static EUR INSTANCE;
    private EUR() {

    }

    public static synchronized EUR getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EUR();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.EUR;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_european_union;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.EUR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.eur;
    }



    @Override
    public CurrencyRates getRates() {

        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.EUR;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.EUR;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.EUR;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.EUR;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.EUR;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.EUR;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.EUR;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.EUR;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.EUR;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.EUR;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.EUR;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.EUR;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.EUR;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.EUR;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.EUR;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.EUR;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.EUR;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.EUR;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.EUR;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.EUR;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.EUR;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.EUR;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.EUR;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.EUR;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.EUR;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.EUR;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.EUR;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.EUR;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.EUR;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.EUR;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.EUR;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.EUR;
        Currency.rates.EUR = 1;
        return Currency.rates;
    }


}
