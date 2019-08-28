package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class DKK extends Currency {
    private static DKK INSTANCE;
    public DKK() {

    }

    public static synchronized DKK getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DKK();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.DKK;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_denmark;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.DKK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.dkk;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.DKK;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.DKK;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.DKK;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.DKK;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.DKK;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.DKK;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.DKK;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.DKK;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.DKK;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.DKK;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.DKK;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.DKK;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.DKK;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.DKK;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.DKK;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.DKK;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.DKK;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.DKK;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.DKK;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.DKK;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.DKK;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.DKK;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.DKK;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.DKK;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.DKK;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.DKK;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.DKK;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.DKK;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.DKK;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.DKK;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.DKK;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.DKK;
        Currency.rates.DKK = 1;
        return Currency.rates;
    }


}
