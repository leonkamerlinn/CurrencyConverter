package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class HRK extends Currency {
    private static HRK INSTANCE;
    public HRK() {

    }

    public static synchronized HRK getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HRK();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.HRK;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_croatia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.HRK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.hrk;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.HRK;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.HRK;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.HRK;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.HRK;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.HRK;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.HRK;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.HRK;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.HRK;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.HRK;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.HRK;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.HRK;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.HRK;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.HRK;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.HRK;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.HRK;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.HRK;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.HRK;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.HRK;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.HRK;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.HRK;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.HRK;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.HRK;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.HRK;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.HRK;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.HRK;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.HRK;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.HRK;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.HRK;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.HRK;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.HRK;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.HRK;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.HRK;
        Currency.rates.HRK = 1;
        return Currency.rates;
    }


}
