package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class CNY extends Currency {
    private static CNY INSTANCE;
    public CNY() {

    }
    public static synchronized CNY getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CNY();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.CNY;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_china;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CNY;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.cny;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.CNY;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.CNY;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.CNY;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.CNY;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.CNY;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.CNY;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.CNY;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.CNY;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.CNY;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.CNY;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.CNY;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.CNY;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.CNY;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.CNY;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.CNY;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.CNY;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.CNY;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.CNY;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.CNY;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.CNY;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.CNY;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.CNY;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.CNY;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.CNY;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.CNY;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.CNY;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.CNY;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.CNY;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.CNY;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.CNY;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.CNY;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.CNY;
        Currency.rates.CNY = 1;
        return Currency.rates;
    }


}
