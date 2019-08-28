package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class BRL extends Currency {
    private static BRL INSTANCE;
    public BRL() {

    }

    public static synchronized BRL getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BRL();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.BRL;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_brazil;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.BRL;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.brl;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.BRL;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.BRL;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.BRL;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.BRL;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.BRL;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.BRL;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.BRL;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.BRL;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.BRL;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.BRL;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.BRL;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.BRL;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.BRL;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.BRL;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.BRL;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.BRL;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.BRL;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.BRL;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.BRL;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.BRL;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.BRL;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.BRL;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.BRL;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.BRL;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.BRL;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.BRL;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.BRL;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.BRL;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.BRL;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.BRL;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.BRL;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.BRL;
        Currency.rates.BRL = 1;
        return Currency.rates;
    }

}
