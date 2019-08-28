package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class CZK extends Currency {
    private static CZK INSTANCE;
    public CZK() {

    }

    public static synchronized CZK getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CZK();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.CZK;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_czech_republic;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CZK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.czk;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.CZK;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.CZK;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.CZK;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.CZK;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.CZK;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.CZK;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.CZK;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.CZK;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.CZK;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.CZK;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.CZK;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.CZK;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.CZK;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.CZK;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.CZK;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.CZK;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.CZK;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.CZK;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.CZK;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.CZK;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.CZK;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.CZK;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.CZK;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.CZK;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.CZK;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.CZK;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.CZK;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.CZK;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.CZK;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.CZK;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.CZK;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.CZK;
        Currency.rates.CZK = 1;
        return Currency.rates;
    }


}
