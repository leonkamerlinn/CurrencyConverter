package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class IDR extends Currency {
    private static IDR INSTANCE;
    public IDR() {

    }

    public static synchronized IDR getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IDR();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.IDR;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_indonesia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.IDR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.idr;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.IDR;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.IDR;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.IDR;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.IDR;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.IDR;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.IDR;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.IDR;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.IDR;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.IDR;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.IDR;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.IDR;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.IDR;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.IDR;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.IDR;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.IDR;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.IDR;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.IDR;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.IDR;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.IDR;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.IDR;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.IDR;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.IDR;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.IDR;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.IDR;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.IDR;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.IDR;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.IDR;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.IDR;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.IDR;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.IDR;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.IDR;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.IDR;
        Currency.rates.IDR = 1;
        return Currency.rates;
    }


}
