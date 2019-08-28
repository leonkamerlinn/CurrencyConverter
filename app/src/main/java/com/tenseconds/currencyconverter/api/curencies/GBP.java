package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class GBP extends Currency {
    private static GBP INSTANCE;
    public GBP() {

    }

    public static synchronized GBP getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GBP();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.GBP;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_united_kingdom;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.GBP;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.gbp;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.GBP;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.GBP;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.GBP;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.GBP;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.GBP;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.GBP;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.GBP;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.GBP;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.GBP;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.GBP;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.GBP;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.GBP;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.GBP;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.GBP;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.GBP;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.GBP;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.GBP;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.GBP;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.GBP;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.GBP;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.GBP;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.GBP;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.GBP;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.GBP;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.GBP;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.GBP;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.GBP;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.GBP;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.GBP;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.GBP;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.GBP;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.GBP;
        Currency.rates.GBP = 1;
        return Currency.rates;
    }


}
