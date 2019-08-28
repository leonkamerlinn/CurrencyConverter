package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class TRY extends Currency {
    private static TRY INSTANCE;
    public TRY() {

    }

    public static synchronized TRY getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TRY();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.TRY;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_turkey;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.TRY;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.turkish_lira;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.TRY;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.TRY;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.TRY;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.TRY;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.TRY;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.TRY;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.TRY;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.TRY;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.TRY;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.TRY;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.TRY;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.TRY;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.TRY;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.TRY;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.TRY;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.TRY;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.TRY;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.TRY;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.TRY;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.TRY;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.TRY;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.TRY;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.TRY;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.TRY;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.TRY;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.TRY;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.TRY;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.TRY;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.TRY;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.TRY;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.TRY;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.TRY;
        Currency.rates.TRY = 1;
        return Currency.rates;
    }


}
