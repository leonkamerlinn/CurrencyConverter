package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class HUF extends Currency {
    private static HUF INSTANCE;
    public HUF() {

    }

    public static synchronized HUF getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HUF();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.HUF;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_hungary;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.HUF;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.huf;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.HUF;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.HUF;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.HUF;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.HUF;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.HUF;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.HUF;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.HUF;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.HUF;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.HUF;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.HUF;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.HUF;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.HUF;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.HUF;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.HUF;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.HUF;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.HUF;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.HUF;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.HUF;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.HUF;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.HUF;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.HUF;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.HUF;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.HUF;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.HUF;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.HUF;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.HUF;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.HUF;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.HUF;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.HUF;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.HUF;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.HUF;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.HUF;
        Currency.rates.HUF = 1;
        return Currency.rates;
    }


}
