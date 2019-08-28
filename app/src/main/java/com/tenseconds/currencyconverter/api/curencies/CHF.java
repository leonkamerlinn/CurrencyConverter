package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class CHF extends Currency {
    private static CHF INSTANCE;
    public CHF() {

    }

    public static synchronized CHF getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CHF();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.CHF;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_switzerland;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CHF;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.chf;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.CHF;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.CHF;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.CHF;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.CHF;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.CHF;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.CHF;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.CHF;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.CHF;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.CHF;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.CHF;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.CHF;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.CHF;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.CHF;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.CHF;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.CHF;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.CHF;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.CHF;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.CHF;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.CHF;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.CHF;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.CHF;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.CHF;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.CHF;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.CHF;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.CHF;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.CHF;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.CHF;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.CHF;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.CHF;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.CHF;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.CHF;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.CHF;
        Currency.rates.CHF = 1;
        return Currency.rates;
    }


}
