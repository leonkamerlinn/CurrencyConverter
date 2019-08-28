package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class THB extends Currency {
    private static THB INSTANCE;
    public THB() {

    }

    public static synchronized THB getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new THB();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.THB;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_thailand;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.THB;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.thb;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.THB;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.THB;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.THB;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.THB;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.THB;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.THB;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.THB;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.THB;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.THB;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.THB;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.THB;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.THB;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.THB;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.THB;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.THB;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.THB;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.THB;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.THB;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.THB;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.THB;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.THB;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.THB;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.THB;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.THB;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.THB;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.THB;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.THB;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.THB;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.THB;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.THB;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.THB;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.THB;
        Currency.rates.THB = 1;
        return Currency.rates;
    }


}
