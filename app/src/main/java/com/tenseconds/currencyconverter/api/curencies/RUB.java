package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class RUB extends Currency {
    private static RUB INSTANCE;
    public RUB() {

    }

    public static synchronized RUB getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RUB();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.RUB;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_russia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.RUB;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.rub;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.RUB;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.RUB;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.RUB;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.RUB;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.RUB;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.RUB;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.RUB;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.RUB;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.RUB;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.RUB;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.RUB;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.RUB;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.RUB;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.RUB;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.RUB;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.RUB;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.RUB;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.RUB;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.RUB;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.RUB;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.RUB;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.RUB;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.RUB;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.RUB;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.RUB;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.RUB;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.RUB;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.RUB;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.RUB;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.RUB;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.RUB;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.RUB;
        Currency.rates.RUB = 1;
        return Currency.rates;
    }


}
