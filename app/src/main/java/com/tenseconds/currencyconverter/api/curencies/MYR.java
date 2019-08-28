package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class MYR extends Currency {
    private static MYR INSTANCE;
    public MYR() {

    }

    public static synchronized MYR getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MYR();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.MYR;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_malaysia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.MYR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.myr;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.MYR;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.MYR;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.MYR;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.MYR;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.MYR;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.MYR;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.MYR;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.MYR;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.MYR;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.MYR;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.MYR;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.MYR;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.MYR;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.MYR;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.MYR;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.MYR;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.MYR;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.MYR;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.MYR;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.MYR;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.MYR;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.MYR;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.MYR;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.MYR;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.MYR;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.MYR;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.MYR;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.MYR;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.MYR;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.MYR;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.MYR;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.MYR;
        Currency.rates.MYR = 1;
        return Currency.rates;
    }


}
