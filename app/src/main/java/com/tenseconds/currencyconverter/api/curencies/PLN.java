package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class PLN extends Currency {
    private static PLN INSTANCE;
    public PLN() {

    }

    public static synchronized PLN getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PLN();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.PLN;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_poland;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.PLN;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.pln;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.PLN;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.PLN;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.PLN;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.PLN;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.PLN;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.PLN;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.PLN;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.PLN;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.PLN;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.PLN;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.PLN;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.PLN;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.PLN;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.PLN;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.PLN;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.PLN;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.PLN;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.PLN;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.PLN;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.PLN;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.PLN;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.PLN;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.PLN;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.PLN;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.PLN;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.PLN;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.PLN;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.PLN;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.PLN;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.PLN;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.PLN;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.PLN;
        Currency.rates.PLN = 1;
        return Currency.rates;
    }


}
