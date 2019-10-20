package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class NZD extends Currency {
    public NZD(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getNZD();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_new_zealand;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.NZD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.nzd;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getNZD());
        rates.setBGN(rates.getBGN() / rates.getNZD());
        rates.setEUR(rates.getEUR() / rates.getNZD());
        rates.setBRL(rates.getBRL() / rates.getNZD());
        rates.setCAD(rates.getCAD() / rates.getNZD());
        rates.setCHF(rates.getCHF() / rates.getNZD());
        rates.setCNY(rates.getCNY() / rates.getNZD());
        rates.setCZK(rates.getCZK() / rates.getNZD());
        rates.setDKK(rates.getDKK() / rates.getNZD());
        rates.setGBP(rates.getGBP() / rates.getNZD());
        rates.setHKD(rates.getHKD() / rates.getNZD());
        rates.setHRK(rates.getHRK() / rates.getNZD());
        rates.setHUF(rates.getHUF() / rates.getNZD());
        rates.setIDR(rates.getIDR() / rates.getNZD());
        rates.setILS(rates.getILS() / rates.getNZD());
        rates.setINR(rates.getINR() / rates.getNZD());
        rates.setISK(rates.getISK() / rates.getNZD());
        rates.setJPY(rates.getJPY() / rates.getNZD());
        rates.setKRW(rates.getKRW() / rates.getNZD());
        rates.setMXN(rates.getMXN() / rates.getNZD());
        rates.setMYR(rates.getMYR() / rates.getNZD());
        rates.setNOK(rates.getNOK() / rates.getNZD());
        rates.setPHP(rates.getPHP() / rates.getNZD());
        rates.setPLN(rates.getPLN() / rates.getNZD());
        rates.setRON(rates.getRON() / rates.getNZD());
        rates.setRUB(rates.getRUB() / rates.getNZD());
        rates.setSEK(rates.getSEK() / rates.getNZD());
        rates.setSGD(rates.getSGD() / rates.getNZD());
        rates.setTHB(rates.getTHB() / rates.getNZD());
        rates.setTRY(rates.getTRY() / rates.getNZD());
        rates.setUSD(rates.getUSD() / rates.getNZD());
        rates.setZAR(rates.getZAR() / rates.getNZD());
        rates.setNZD(1);
        return rates;
    }

}
