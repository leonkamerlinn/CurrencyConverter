package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class BRL extends Currency {
    public BRL(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getBRL();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_brazil;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.BRL;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.brl;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getBRL());
        rates.setBGN(rates.getBGN() / rates.getBRL());
        rates.setEUR(rates.getEUR() / rates.getBRL());
        rates.setCAD(rates.getCAD() / rates.getBRL());
        rates.setCHF(rates.getCHF() / rates.getBRL());
        rates.setCNY(rates.getCNY() / rates.getBRL());
        rates.setCZK(rates.getCZK() / rates.getBRL());
        rates.setDKK(rates.getDKK() / rates.getBRL());
        rates.setGBP(rates.getGBP() / rates.getBRL());
        rates.setHKD(rates.getHKD() / rates.getBRL());
        rates.setHRK(rates.getHRK() / rates.getBRL());
        rates.setHUF(rates.getHUF() / rates.getBRL());
        rates.setIDR(rates.getIDR() / rates.getBRL());
        rates.setILS(rates.getILS() / rates.getBRL());
        rates.setINR(rates.getINR() / rates.getBRL());
        rates.setISK(rates.getISK() / rates.getBRL());
        rates.setJPY(rates.getJPY() / rates.getBRL());
        rates.setKRW(rates.getKRW() / rates.getBRL());
        rates.setMXN(rates.getMXN() / rates.getBRL());
        rates.setMYR(rates.getMYR() / rates.getBRL());
        rates.setNOK(rates.getNOK() / rates.getBRL());
        rates.setNZD(rates.getNZD() / rates.getBRL());
        rates.setPHP(rates.getPHP() / rates.getBRL());
        rates.setPLN(rates.getPLN() / rates.getBRL());
        rates.setRON(rates.getRON() / rates.getBRL());
        rates.setRUB(rates.getRUB() / rates.getBRL());
        rates.setSEK(rates.getSEK() / rates.getBRL());
        rates.setSGD(rates.getSGD() / rates.getBRL());
        rates.setTHB(rates.getTHB() / rates.getBRL());
        rates.setTRY(rates.getTRY() / rates.getBRL());
        rates.setUSD(rates.getUSD() / rates.getBRL());
        rates.setZAR(rates.getZAR() / rates.getBRL());
        rates.setBRL(1);
        return rates;
    }

}
