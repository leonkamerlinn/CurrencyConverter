package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class KRW extends Currency {
    private static KRW INSTANCE;
    public KRW() {

    }

    public static synchronized KRW getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new KRW();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.KRW;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_south_korea;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.KRW;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.krw;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.KRW;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.KRW;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.KRW;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.KRW;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.KRW;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.KRW;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.KRW;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.KRW;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.KRW;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.KRW;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.KRW;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.KRW;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.KRW;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.KRW;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.KRW;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.KRW;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.KRW;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.KRW;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.KRW;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.KRW;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.KRW;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.KRW;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.KRW;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.KRW;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.KRW;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.KRW;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.KRW;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.KRW;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.KRW;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.KRW;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.KRW;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.KRW;
        Currency.rates.KRW = 1;
        return Currency.rates;
    }


}
