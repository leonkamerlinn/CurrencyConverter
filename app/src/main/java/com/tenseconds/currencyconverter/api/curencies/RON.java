package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class RON extends Currency {

    public RON(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getRON();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_romania;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.RON;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.ron;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getRON());
        rates.setBGN(rates.getBGN() / rates.getRON());
        rates.setEUR(rates.getEUR() / rates.getRON());
        rates.setBRL(rates.getBRL() / rates.getRON());
        rates.setCAD(rates.getCAD() / rates.getRON());
        rates.setCHF(rates.getCHF() / rates.getRON());
        rates.setCNY(rates.getCNY() / rates.getRON());
        rates.setCZK(rates.getCZK() / rates.getRON());
        rates.setDKK(rates.getDKK() / rates.getRON());
        rates.setGBP(rates.getGBP() / rates.getRON());
        rates.setHKD(rates.getHKD() / rates.getRON());
        rates.setHRK(rates.getHRK() / rates.getRON());
        rates.setHUF(rates.getHUF() / rates.getRON());
        rates.setIDR(rates.getIDR() / rates.getRON());
        rates.setILS(rates.getILS() / rates.getRON());
        rates.setINR(rates.getINR() / rates.getRON());
        rates.setISK(rates.getISK() / rates.getRON());
        rates.setJPY(rates.getJPY() / rates.getRON());
        rates.setKRW(rates.getKRW() / rates.getRON());
        rates.setMXN(rates.getMXN() / rates.getRON());
        rates.setMYR(rates.getMYR() / rates.getRON());
        rates.setNOK(rates.getNOK() / rates.getRON());
        rates.setNZD(rates.getNZD() / rates.getRON());
        rates.setPHP(rates.getPHP() / rates.getRON());
        rates.setPLN(rates.getPLN() / rates.getRON());
        rates.setRUB(rates.getRUB() / rates.getRON());
        rates.setSEK(rates.getSEK() / rates.getRON());
        rates.setSGD(rates.getSGD() / rates.getRON());
        rates.setTHB(rates.getTHB() / rates.getRON());
        rates.setTRY(rates.getTRY() / rates.getRON());
        rates.setUSD(rates.getUSD() / rates.getRON());
        rates.setZAR(rates.getZAR() / rates.getRON());
        rates.setRON(1);
        return rates;
    }

}
