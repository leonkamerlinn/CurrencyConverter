package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class AUD extends Currency {
    private static AUD INSTANCE;
    public AUD() {

    }

    public static synchronized AUD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AUD();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.AUD;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_australia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.AUD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.aud;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.AUD;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.AUD;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.AUD;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.AUD;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.AUD;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.AUD;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.AUD;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.AUD;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.AUD;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.AUD;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.AUD;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.AUD;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.AUD;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.AUD;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.AUD;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.AUD;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.AUD;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.AUD;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.AUD;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.AUD;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.AUD;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.AUD;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.AUD;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.AUD;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.AUD;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.AUD;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.AUD;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.AUD;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.AUD;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.AUD;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.AUD;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.AUD;
        Currency.rates.AUD = 1;
        return Currency.rates;
    }

}
