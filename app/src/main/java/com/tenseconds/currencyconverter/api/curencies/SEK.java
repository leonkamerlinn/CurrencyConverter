package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class SEK extends Currency {
    private static SEK INSTANCE;
    public SEK() {

    }

    public static synchronized SEK getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SEK();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.SEK;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_sweden;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.SEK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.sek;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.SEK;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.SEK;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.SEK;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.SEK;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.SEK;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.SEK;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.SEK;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.SEK;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.SEK;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.SEK;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.SEK;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.SEK;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.SEK;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.SEK;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.SEK;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.SEK;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.SEK;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.SEK;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.SEK;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.SEK;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.SEK;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.SEK;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.SEK;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.SEK;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.SEK;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.SEK;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.SEK;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.SEK;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.SEK;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.SEK;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.SEK;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.SEK;
        Currency.rates.SEK = 1;
        return Currency.rates;
    }


}
