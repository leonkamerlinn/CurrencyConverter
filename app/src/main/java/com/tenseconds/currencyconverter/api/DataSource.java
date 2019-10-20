package com.tenseconds.currencyconverter.api;

import java.util.Objects;

public class DataSource {
    public DataSource() {}

    public String base;
    public String date;
    public CurrencyRates rates;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataSource data = (DataSource) o;
        return Objects.equals(base, data.base) &&
                Objects.equals(date, data.date) &&
                Objects.equals(rates, data.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, date, rates);
    }
}
