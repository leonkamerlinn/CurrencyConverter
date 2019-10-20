package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class HKD extends Currency {

    public HKD(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getHKD();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_hong_kong;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.HKD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.hkd;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getHKD());
        rates.setBGN(rates.getBGN() / rates.getHKD());
        rates.setEUR(rates.getEUR() / rates.getHKD());
        rates.setBRL(rates.getBRL() / rates.getHKD());
        rates.setCAD(rates.getCAD() / rates.getHKD());
        rates.setCHF(rates.getCHF() / rates.getHKD());
        rates.setCNY(rates.getCNY() / rates.getHKD());
        rates.setCZK(rates.getCZK() / rates.getHKD());
        rates.setDKK(rates.getDKK() / rates.getHKD());
        rates.setGBP(rates.getGBP() / rates.getHKD());
        rates.setHRK(rates.getHRK() / rates.getHKD());
        rates.setHUF(rates.getHUF() / rates.getHKD());
        rates.setIDR(rates.getIDR() / rates.getHKD());
        rates.setILS(rates.getILS() / rates.getHKD());
        rates.setINR(rates.getINR() / rates.getHKD());
        rates.setISK(rates.getISK() / rates.getHKD());
        rates.setJPY(rates.getJPY() / rates.getHKD());
        rates.setKRW(rates.getKRW() / rates.getHKD());
        rates.setMXN(rates.getMXN() / rates.getHKD());
        rates.setMYR(rates.getMYR() / rates.getHKD());
        rates.setNOK(rates.getNOK() / rates.getHKD());
        rates.setNZD(rates.getNZD() / rates.getHKD());
        rates.setPHP(rates.getPHP() / rates.getHKD());
        rates.setPLN(rates.getPLN() / rates.getHKD());
        rates.setRON(rates.getRON() / rates.getHKD());
        rates.setRUB(rates.getRUB() / rates.getHKD());
        rates.setSEK(rates.getSEK() / rates.getHKD());
        rates.setSGD(rates.getSGD() / rates.getHKD());
        rates.setTHB(rates.getTHB() / rates.getHKD());
        rates.setTRY(rates.getTRY() / rates.getHKD());
        rates.setUSD(rates.getUSD() / rates.getHKD());
        rates.setZAR(rates.getZAR() / rates.getHKD());
        rates.setHKD(1);
        return rates;
    }


}
