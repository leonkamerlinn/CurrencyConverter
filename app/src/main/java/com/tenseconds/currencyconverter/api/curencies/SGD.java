package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class SGD extends Currency {
    private static SGD INSTANCE;
    public SGD() {

    }

    public static synchronized SGD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SGD();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.SGD;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_singapore;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.SGD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.sgd;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.SGD;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.SGD;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.SGD;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.SGD;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.SGD;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.SGD;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.SGD;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.SGD;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.SGD;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.SGD;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.SGD;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.SGD;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.SGD;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.SGD;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.SGD;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.SGD;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.SGD;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.SGD;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.SGD;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.SGD;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.SGD;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.SGD;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.SGD;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.SGD;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.SGD;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.SGD;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.SGD;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.SGD;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.SGD;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.SGD;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.SGD;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.SGD;
        Currency.rates.SGD = 1;
        return Currency.rates;
    }


}
