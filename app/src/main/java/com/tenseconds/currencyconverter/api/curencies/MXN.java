package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class MXN extends Currency {

    public MXN(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getMXN();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_mexico;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.MXN;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.mxn;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getMXN());
        rates.setBGN(rates.getBGN() / rates.getMXN());
        rates.setEUR(rates.getEUR() / rates.getMXN());
        rates.setBRL(rates.getBRL() / rates.getMXN());
        rates.setCAD(rates.getCAD() / rates.getMXN());
        rates.setCHF(rates.getCHF() / rates.getMXN());
        rates.setCNY(rates.getCNY() / rates.getMXN());
        rates.setCZK(rates.getCZK() / rates.getMXN());
        rates.setDKK(rates.getDKK() / rates.getMXN());
        rates.setGBP(rates.getGBP() / rates.getMXN());
        rates.setHKD(rates.getHKD() / rates.getMXN());
        rates.setHRK(rates.getHRK() / rates.getMXN());
        rates.setHUF(rates.getHUF() / rates.getMXN());
        rates.setIDR(rates.getIDR() / rates.getMXN());
        rates.setILS(rates.getILS() / rates.getMXN());
        rates.setINR(rates.getINR() / rates.getMXN());
        rates.setISK(rates.getISK() / rates.getMXN());
        rates.setJPY(rates.getJPY() / rates.getMXN());
        rates.setKRW(rates.getKRW() / rates.getMXN());
        rates.setMYR(rates.getMYR() / rates.getMXN());
        rates.setNOK(rates.getNOK() / rates.getMXN());
        rates.setNZD(rates.getNZD() / rates.getMXN());
        rates.setPHP(rates.getPHP() / rates.getMXN());
        rates.setPLN(rates.getPLN() / rates.getMXN());
        rates.setRON(rates.getRON() / rates.getMXN());
        rates.setRUB(rates.getRUB() / rates.getMXN());
        rates.setSEK(rates.getSEK() / rates.getMXN());
        rates.setSGD(rates.getSGD() / rates.getMXN());
        rates.setTHB(rates.getTHB() / rates.getMXN());
        rates.setTRY(rates.getTRY() / rates.getMXN());
        rates.setUSD(rates.getUSD() / rates.getMXN());
        rates.setZAR(rates.getZAR() / rates.getMXN());
        rates.setMXN(1);
        return rates;
    }

}
