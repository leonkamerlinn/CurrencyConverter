package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class CAD extends Currency {
    private static CAD INSTANCE;
    public CAD() {

    }

    public static synchronized CAD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CAD();
        }

        return INSTANCE;
    }


    @Override
    public float getRate() {
        return Currency.rates.CAD;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_canada;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CAD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.cad;
    }



    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.CAD;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.CAD;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.CAD;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.CAD;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.CAD;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.CAD;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.CAD;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.CAD;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.CAD;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.USD;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.USD;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.CAD;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.CAD;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.CAD;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.CAD;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.CAD;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.CAD;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.CAD;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.CAD;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.CAD;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.CAD;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.CAD;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.CAD;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.CAD;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.CAD;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.CAD;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.CAD;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.CAD;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.CAD;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.CAD;
        Currency.rates.USD = Currency.rates.USD / Currency.rates.CAD;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.CAD;
        Currency.rates.CAD = 1;
        return Currency.rates;
    }


}
