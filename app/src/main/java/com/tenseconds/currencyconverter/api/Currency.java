package com.tenseconds.currencyconverter.api;

import androidx.annotation.Nullable;

public abstract class Currency {

    public Currency(DataSource dataSource, float amount) {
        this.rates = dataSource.rates;
        this.base = dataSource.base;
        this.amount = amount;
    }

    protected String base;
    protected float amount;
    protected CurrencyRates rates;

    public static final String EUR = "EUR";
    public static final String AUD = "AUD";
    public static final String BGN = "BGN";
    public static final String BRL = "BRL";
    public static final String CAD = "CAD";
    public static final String CHF = "CHF";
    public static final String CNY = "CNY";
    public static final String CZK = "CZK";
    public static final String DKK = "DKK";
    public static final String GBP = "GBP";
    public static final String HKD = "HKD";
    public static final String HRK = "HRK";
    public static final String HUF = "HUF";
    public static final String IDR = "IDR";
    public static final String ILS = "ILS";
    public static final String INR = "INR";
    public static final String ISK = "ISK";
    public static final String JPY = "JPY";
    public static final String KRW = "KRW";
    public static final String MXN = "MXN";
    public static final String MYR = "MYR";
    public static final String NOK = "NOK";
    public static final String NZD = "NZD";
    public static final String PHP = "PHP";
    public static final String PLN = "PLN";
    public static final String RON = "RON";
    public static final String RUB = "RUB";
    public static final String SEK = "SEK";
    public static final String SGD = "SGD";
    public static final String THB = "THB";
    public static final String TRY = "TRY";
    public static final String USD = "USD";
    public static final String ZAR = "ZAR";

    public static String valueFormat(float number) {
        return String.format("%10.2f", number);
    }

    public static String rateFormat(float number) {
        return String.format("%10.4f", number);
    }



    public abstract float getRate();
    public abstract int getFlagRes();
    public abstract String getCurrencyCode();
    public abstract int getCurrencyNameRes();
    public abstract CurrencyRates getRates();


    public float getValue() {
        return getRate() * amount;
    }

    public String getRateFormat() {
        return Currency.rateFormat(getRate());
    }

    public String getValueFormat() {
        return Currency.valueFormat(getValue());
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setRates(CurrencyRates rates) {
        this.rates = rates;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Currency) {
            Currency other = (Currency)obj;
            return other.getValue() == getValue();
        }
        return false;
    }


}