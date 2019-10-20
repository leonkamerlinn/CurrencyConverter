package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class BGN extends Currency {

    public BGN(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getBGN();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_bulgaria;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.BGN;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.bgn;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getBGN());
        rates.setEUR(rates.getEUR() / rates.getBGN());
        rates.setBRL(rates.getBRL() / rates.getBGN());
        rates.setCAD(rates.getCAD() / rates.getBGN());
        rates.setCHF(rates.getCHF() / rates.getBGN());
        rates.setCNY(rates.getCNY() / rates.getBGN());
        rates.setCZK(rates.getCZK() / rates.getBGN());
        rates.setDKK(rates.getDKK() / rates.getBGN());
        rates.setGBP(rates.getGBP() / rates.getBGN());
        rates.setHKD(rates.getHKD() / rates.getBGN());
        rates.setHRK(rates.getHRK() / rates.getBGN());
        rates.setHUF(rates.getHUF() / rates.getBGN());
        rates.setIDR(rates.getIDR() / rates.getBGN());
        rates.setILS(rates.getILS() / rates.getBGN());
        rates.setINR(rates.getINR() / rates.getBGN());
        rates.setISK(rates.getISK() / rates.getBGN());
        rates.setJPY(rates.getJPY() / rates.getBGN());
        rates.setKRW(rates.getKRW() / rates.getBGN());
        rates.setMXN(rates.getMXN() / rates.getBGN());
        rates.setMYR(rates.getMYR() / rates.getBGN());
        rates.setNOK(rates.getNOK() / rates.getBGN());
        rates.setNZD(rates.getNZD() / rates.getBGN());
        rates.setPHP(rates.getPHP() / rates.getBGN());
        rates.setPLN(rates.getPLN() / rates.getBGN());
        rates.setRON(rates.getRON() / rates.getBGN());
        rates.setRUB(rates.getRUB() / rates.getBGN());
        rates.setSEK(rates.getSEK() / rates.getBGN());
        rates.setSGD(rates.getSGD() / rates.getBGN());
        rates.setTHB(rates.getTHB() / rates.getBGN());
        rates.setTRY(rates.getTRY() / rates.getBGN());
        rates.setUSD(rates.getUSD() / rates.getBGN());
        rates.setZAR(rates.getZAR() / rates.getBGN());
        rates.setBGN(1);
        return rates;
    }
}
