package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class NOK extends Currency {
    private static NOK INSTANCE;
    public NOK() {

    }

    public static synchronized NOK getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NOK();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.NOK;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_norway;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.NOK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.nok;
    }

    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.NOK;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.NOK;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.NOK;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.NOK;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.NOK;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.NOK;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.NOK;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.NOK;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.NOK;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.NOK;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.NOK;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.NOK;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.NOK;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.NOK;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.NOK;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.NOK;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.NOK;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.NOK;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.NOK;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.NOK;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.NOK;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.NOK;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.NOK;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.NOK;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.NOK;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.NOK;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.NOK;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.NOK;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.NOK;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.NOK;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.NOK;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.NOK;
        Currency.rates.NOK = 1;
        return Currency.rates;
    }


}
