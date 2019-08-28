package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class ZAR extends Currency {
    private static ZAR INSTANCE;
    public ZAR() {

    }

    public static synchronized ZAR getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ZAR();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.ZAR;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_south_africa;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.ZAR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.zar;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.ZAR;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.ZAR;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.ZAR;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.ZAR;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.ZAR;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.ZAR;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.ZAR;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.ZAR;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.ZAR;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.ZAR;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.ZAR;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.ZAR;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.ZAR;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.ZAR;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.ZAR;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.ZAR;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.ZAR;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.ZAR;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.ZAR;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.ZAR;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.ZAR;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.ZAR;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.ZAR;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.ZAR;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.ZAR;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.ZAR;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.ZAR;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.ZAR;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.ZAR;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.ZAR;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.ZAR;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.ZAR;
        Currency.rates.ZAR = 1;
        return Currency.rates;
    }


}
