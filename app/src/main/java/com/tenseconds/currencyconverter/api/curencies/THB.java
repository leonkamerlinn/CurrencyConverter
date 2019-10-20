package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class THB extends Currency {
    public THB(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getTHB();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_thailand;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.THB;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.thb;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getTHB());
        rates.setBGN(rates.getBGN() / rates.getTHB());
        rates.setEUR(rates.getEUR() / rates.getTHB());
        rates.setBRL(rates.getBRL() / rates.getTHB());
        rates.setCAD(rates.getCAD() / rates.getTHB());
        rates.setCHF(rates.getCHF() / rates.getTHB());
        rates.setCNY(rates.getCNY() / rates.getTHB());
        rates.setCZK(rates.getCZK() / rates.getTHB());
        rates.setDKK(rates.getDKK() / rates.getTHB());
        rates.setGBP(rates.getGBP() / rates.getTHB());
        rates.setHKD(rates.getHKD() / rates.getTHB());
        rates.setHRK(rates.getHRK() / rates.getTHB());
        rates.setHUF(rates.getHUF() / rates.getTHB());
        rates.setIDR(rates.getIDR() / rates.getTHB());
        rates.setILS(rates.getILS() / rates.getTHB());
        rates.setINR(rates.getINR() / rates.getTHB());
        rates.setISK(rates.getISK() / rates.getTHB());
        rates.setJPY(rates.getJPY() / rates.getTHB());
        rates.setKRW(rates.getKRW() / rates.getTHB());
        rates.setMXN(rates.getMXN() / rates.getTHB());
        rates.setMYR(rates.getMYR() / rates.getTHB());
        rates.setNOK(rates.getNOK() / rates.getTHB());
        rates.setNZD(rates.getNZD() / rates.getTHB());
        rates.setPHP(rates.getPHP() / rates.getTHB());
        rates.setPLN(rates.getPLN() / rates.getTHB());
        rates.setRON(rates.getRON() / rates.getTHB());
        rates.setRUB(rates.getRUB() / rates.getTHB());
        rates.setSEK(rates.getSEK() / rates.getTHB());
        rates.setSGD(rates.getSGD() / rates.getTHB());
        rates.setTRY(rates.getTRY() / rates.getTHB());
        rates.setUSD(rates.getUSD() / rates.getTHB());
        rates.setZAR(rates.getZAR() / rates.getTHB());
        rates.setTHB(1);
        return rates;
    }

}
