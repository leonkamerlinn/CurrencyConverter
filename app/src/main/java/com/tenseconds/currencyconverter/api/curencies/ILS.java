package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class ILS extends Currency {
    private static ILS INSTANCE;
    public ILS() {

    }

    public static synchronized ILS getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ILS();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.ILS;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_israel;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.ILS;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.ils;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.ILS;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.ILS;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.ILS;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.ILS;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.ILS;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.ILS;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.ILS;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.ILS;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.ILS;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.ILS;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.ILS;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.ILS;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.ILS;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.ILS;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.ILS;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.ILS;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.ILS;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.ILS;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.ILS;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.ILS;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.ILS;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.ILS;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.ILS;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.ILS;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.ILS;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.ILS;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.ILS;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.ILS;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.ILS;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.ILS;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.ILS;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.ILS;
        Currency.rates.ILS = 1;
        return Currency.rates;
    }


}
