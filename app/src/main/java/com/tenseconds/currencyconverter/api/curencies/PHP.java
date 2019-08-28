package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class PHP extends Currency {
    private static PHP INSTANCE;
    public PHP() {

    }

    public static synchronized PHP getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PHP();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.PHP;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_philippines;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.PHP;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.php;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.PHP;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.PHP;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.PHP;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.PHP;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.PHP;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.PHP;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.PHP;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.PHP;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.PHP;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.PHP;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.PHP;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.PHP;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.PHP;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.PHP;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.PHP;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.PHP;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.PHP;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.PHP;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.PHP;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.PHP;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.PHP;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.PHP;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.PHP;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.PHP;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.PHP;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.PHP;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.PHP;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.PHP;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.PHP;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.PHP;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.PHP;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.PHP;
        Currency.rates.PHP = 1;
        return Currency.rates;
    }


}
