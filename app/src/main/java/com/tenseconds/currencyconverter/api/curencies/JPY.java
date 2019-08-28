package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class JPY extends Currency {
    private static JPY INSTANCE;
    public JPY() {

    }

    public static synchronized JPY getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new JPY();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.JPY;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_japan;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.JPY;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.jpy;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.JPY;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.JPY;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.JPY;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.JPY;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.JPY;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.JPY;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.JPY;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.JPY;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.JPY;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.JPY;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.JPY;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.JPY;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.JPY;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.JPY;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.JPY;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.JPY;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.JPY;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.JPY;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.JPY;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.JPY;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.JPY;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.JPY;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.JPY;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.JPY;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.JPY;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.JPY;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.JPY;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.JPY;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.JPY;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.JPY;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.JPY;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.JPY;
        Currency.rates.JPY = 1;
        return Currency.rates;
    }


}
