package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class JPY extends Currency {

    public JPY(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getJPY();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_japan;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.JPY;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.jpy;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getJPY());
        rates.setBGN(rates.getBGN() / rates.getJPY());
        rates.setEUR(rates.getEUR() / rates.getJPY());
        rates.setBRL(rates.getBRL() / rates.getJPY());
        rates.setCAD(rates.getCAD() / rates.getJPY());
        rates.setCHF(rates.getCHF() / rates.getJPY());
        rates.setCNY(rates.getCNY() / rates.getJPY());
        rates.setCZK(rates.getCZK() / rates.getJPY());
        rates.setDKK(rates.getDKK() / rates.getJPY());
        rates.setGBP(rates.getGBP() / rates.getJPY());
        rates.setHKD(rates.getHKD() / rates.getJPY());
        rates.setHRK(rates.getHRK() / rates.getJPY());
        rates.setHUF(rates.getHUF() / rates.getJPY());
        rates.setIDR(rates.getIDR() / rates.getJPY());
        rates.setILS(rates.getILS() / rates.getJPY());
        rates.setINR(rates.getINR() / rates.getJPY());
        rates.setISK(rates.getISK() / rates.getJPY());
        rates.setKRW(rates.getKRW() / rates.getJPY());
        rates.setMXN(rates.getMXN() / rates.getJPY());
        rates.setMYR(rates.getMYR() / rates.getJPY());
        rates.setNOK(rates.getNOK() / rates.getJPY());
        rates.setNZD(rates.getNZD() / rates.getJPY());
        rates.setPHP(rates.getPHP() / rates.getJPY());
        rates.setPLN(rates.getPLN() / rates.getJPY());
        rates.setRON(rates.getRON() / rates.getJPY());
        rates.setRUB(rates.getRUB() / rates.getJPY());
        rates.setSEK(rates.getSEK() / rates.getJPY());
        rates.setSGD(rates.getSGD() / rates.getJPY());
        rates.setTHB(rates.getTHB() / rates.getJPY());
        rates.setTRY(rates.getTRY() / rates.getJPY());
        rates.setUSD(rates.getUSD() / rates.getJPY());
        rates.setZAR(rates.getZAR() / rates.getJPY());
        rates.setJPY(1);
        return rates;
    }


}
