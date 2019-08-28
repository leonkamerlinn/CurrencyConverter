package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class INR extends Currency {
    private static INR INSTANCE;
    public INR() {

    }

    public static synchronized INR getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new INR();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.INR;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_india;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.INR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.inr;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.INR;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.INR;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.INR;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.INR;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.INR;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.INR;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.INR;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.INR;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.INR;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.INR;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.INR;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.INR;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.INR;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.INR;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.INR;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.INR;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.INR;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.INR;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.INR;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.INR;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.INR;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.INR;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.INR;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.INR;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.INR;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.INR;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.INR;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.INR;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.INR;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.INR;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.INR;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.INR;
        Currency.rates.INR = 1;
        return Currency.rates;
    }


}
