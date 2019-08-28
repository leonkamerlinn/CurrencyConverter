package com.tenseconds.currencyconverter.api;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public abstract class Currency {

    public static String base = Currency.EUR;
    public static float amount = 100.00f;
    public static CurrencyRates rates;

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

    public static String rateformat(float number) {
        return String.format("%10.4f", number);
    }

    public static String[] getCurrencyCodes() {
        return new String[] {
            EUR,
            AUD,
            BGN,
            BRL,
            CAD,
            CHF,
            CNY,
            CZK,
            DKK,
            GBP,
            HKD,
            HRK,
            HUF,
            IDR,
            ILS,
            INR,
            ISK,
            JPY,
            KRW,
            MXN,
            MYR,
            NOK,
            NZD,
            PHP,
            PLN,
            RON,
            RUB,
            SEK,
            SGD,
            THB,
            TRY,
            USD,
            ZAR
        };

    }
    
    public static List<Currency> getCurrencyList() {
        List<Currency> currencyList = new ArrayList<>();
        for (String currencyCode: getCurrencyCodes()) {
            currencyList.add(CurrencyFactory.getCurrency(currencyCode));
        }
        return currencyList;
    }

    public abstract float getRate();
    public abstract int getFlagRes();
    public abstract String getCurrencyCode();
    public abstract int getCurrencyNameRes();
    public abstract CurrencyRates getRates();


    public float getValue() {
        return getRate() * Currency.amount;
    }

    public String getRateFormat() {
        return Currency.rateformat(getRate());
    }

    public String getValueFormat() {
        return Currency.valueFormat(getValue());
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Currency) {
            Currency other = (Currency)obj;
            return other.getValue() == getValue();
        }
        return false;
    }

    public static CurrencyRates getDefaultRates() {
        CurrencyRates currencyRates = new CurrencyRates();
        currencyRates.AUD = 1.6107f;
        currencyRates.BGN = 1.9488f;
        currencyRates.BRL = 4.7748f;
        currencyRates.CAD = 1.5283f;
        currencyRates.CHF = 1.1235f;
        currencyRates.CNY = 7.9169f;
        currencyRates.CZK = 25.624f;
        currencyRates.DKK = 7.4302f;
        currencyRates.GBP = 0.89505f;
        currencyRates.HKD = 9.0999f;
        currencyRates.HRK = 7.4077f;
        currencyRates.HUF = 325.33f;
        currencyRates.IDR = 17262f;
        currencyRates.ILS = 4.1558f;
        currencyRates.INR = 83.42f;
        currencyRates.ISK = 127.35f;
        currencyRates.JPY = 129.09f;
        currencyRates.KRW = 1300.1f;
        currencyRates.MXN = 22.286f;
        currencyRates.MYR = 4.7949f;
        currencyRates.NOK = 9.7412f;
        currencyRates.NZD = 1.757f;
        currencyRates.PHP = 62.369f;
        currencyRates.PLN = 4.3029f;
        currencyRates.RON = 4.622f;
        currencyRates.RUB = 79.292f;
        currencyRates.SEK = 10.553f;
        currencyRates.SGD = 1.5943f;
        currencyRates.THB = 37.994f;
        currencyRates.TRY = 7.6011f;
        currencyRates.USD = 1.1593f;
        currencyRates.ZAR = 17.76f;
        return currencyRates;
    }
}
