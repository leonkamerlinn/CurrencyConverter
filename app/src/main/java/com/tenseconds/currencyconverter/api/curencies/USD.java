package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;

public class USD extends Currency {
    private static USD INSTANCE;
    public USD() {

    }

    public static synchronized USD getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new USD();
        }

        return INSTANCE;
    }



    @Override
    public float getRate() {
        return Currency.rates.USD;
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_united_states_of_america;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.USD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.usd;
    }


    @Override
    public CurrencyRates getRates() {
        Currency.rates.EUR = Currency.rates.EUR / Currency.rates.USD;
        Currency.rates.AUD = Currency.rates.AUD / Currency.rates.USD;
        Currency.rates.BGN = Currency.rates.BGN / Currency.rates.USD;
        Currency.rates.BRL = Currency.rates.BRL / Currency.rates.USD;
        Currency.rates.CAD = Currency.rates.CAD / Currency.rates.USD;
        Currency.rates.CHF = Currency.rates.CHF / Currency.rates.USD;
        Currency.rates.CNY = Currency.rates.CNY / Currency.rates.USD;
        Currency.rates.CZK = Currency.rates.CZK / Currency.rates.USD;
        Currency.rates.DKK = Currency.rates.DKK / Currency.rates.USD;
        Currency.rates.GBP = Currency.rates.GBP / Currency.rates.USD;
        Currency.rates.HKD = Currency.rates.HKD / Currency.rates.USD;
        Currency.rates.HRK = Currency.rates.HRK / Currency.rates.USD;
        Currency.rates.HUF = Currency.rates.HUF / Currency.rates.USD;
        Currency.rates.IDR = Currency.rates.IDR / Currency.rates.USD;
        Currency.rates.ILS = Currency.rates.ILS / Currency.rates.USD;
        Currency.rates.INR = Currency.rates.INR / Currency.rates.USD;
        Currency.rates.ISK = Currency.rates.ISK / Currency.rates.USD;
        Currency.rates.JPY = Currency.rates.JPY / Currency.rates.USD;
        Currency.rates.KRW = Currency.rates.KRW / Currency.rates.USD;
        Currency.rates.MXN = Currency.rates.MXN / Currency.rates.USD;
        Currency.rates.MYR = Currency.rates.MYR / Currency.rates.USD;
        Currency.rates.NOK = Currency.rates.NOK / Currency.rates.USD;
        Currency.rates.NZD = Currency.rates.NZD / Currency.rates.USD;
        Currency.rates.PHP = Currency.rates.PHP / Currency.rates.USD;
        Currency.rates.PLN = Currency.rates.PLN / Currency.rates.USD;
        Currency.rates.RON = Currency.rates.RON / Currency.rates.USD;
        Currency.rates.RUB = Currency.rates.RUB / Currency.rates.USD;
        Currency.rates.SEK = Currency.rates.SEK / Currency.rates.USD;
        Currency.rates.SGD = Currency.rates.SGD / Currency.rates.USD;
        Currency.rates.THB = Currency.rates.THB / Currency.rates.USD;
        Currency.rates.TRY = Currency.rates.TRY / Currency.rates.USD;
        Currency.rates.ZAR = Currency.rates.ZAR / Currency.rates.USD;
        Currency.rates.USD = 1;
        return Currency.rates;
    }


}
