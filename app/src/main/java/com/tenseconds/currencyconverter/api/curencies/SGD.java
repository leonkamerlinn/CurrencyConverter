package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class SGD extends Currency {
    public SGD(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getSGD();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_singapore;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.SGD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.sgd;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getSGD());
        rates.setBGN(rates.getBGN() / rates.getSGD());
        rates.setEUR(rates.getEUR() / rates.getSGD());
        rates.setBRL(rates.getBRL() / rates.getSGD());
        rates.setCAD(rates.getCAD() / rates.getSGD());
        rates.setCHF(rates.getCHF() / rates.getSGD());
        rates.setCNY(rates.getCNY() / rates.getSGD());
        rates.setCZK(rates.getCZK() / rates.getSGD());
        rates.setDKK(rates.getDKK() / rates.getSGD());
        rates.setGBP(rates.getGBP() / rates.getSGD());
        rates.setHKD(rates.getHKD() / rates.getSGD());
        rates.setHRK(rates.getHRK() / rates.getSGD());
        rates.setHUF(rates.getHUF() / rates.getSGD());
        rates.setIDR(rates.getIDR() / rates.getSGD());
        rates.setILS(rates.getILS() / rates.getSGD());
        rates.setINR(rates.getINR() / rates.getSGD());
        rates.setISK(rates.getISK() / rates.getSGD());
        rates.setJPY(rates.getJPY() / rates.getSGD());
        rates.setKRW(rates.getKRW() / rates.getSGD());
        rates.setMXN(rates.getMXN() / rates.getSGD());
        rates.setMYR(rates.getMYR() / rates.getSGD());
        rates.setNOK(rates.getNOK() / rates.getSGD());
        rates.setNZD(rates.getNZD() / rates.getSGD());
        rates.setPHP(rates.getPHP() / rates.getSGD());
        rates.setPLN(rates.getPLN() / rates.getSGD());
        rates.setRON(rates.getRON() / rates.getSGD());
        rates.setRUB(rates.getRUB() / rates.getSGD());
        rates.setSEK(rates.getSEK() / rates.getSGD());
        rates.setTHB(rates.getTHB() / rates.getSGD());
        rates.setTRY(rates.getTRY() / rates.getSGD());
        rates.setUSD(rates.getUSD() / rates.getSGD());
        rates.setZAR(rates.getZAR() / rates.getSGD());
        rates.setSGD(1);
        return rates;
    }


}
