package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class AUD extends Currency {

    public AUD(DataSource data, float amount) {
        super(data, amount);
    }





    @Override
    public float getRate() {
        return rates.getAUD();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_australia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.AUD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.aud;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setEUR(rates.getEUR() / rates.getAUD());
        rates.setBGN(rates.getBGN() / rates.getAUD());
        rates.setBRL(rates.getBRL() / rates.getAUD());
        rates.setCAD(rates.getCAD() / rates.getAUD());
        rates.setCHF(rates.getCHF() / rates.getAUD());
        rates.setCNY(rates.getCNY() / rates.getAUD());
        rates.setCZK(rates.getCZK() / rates.getAUD());
        rates.setDKK(rates.getDKK() / rates.getAUD());
        rates.setGBP(rates.getGBP() / rates.getAUD());
        rates.setHKD(rates.getHKD() / rates.getAUD());
        rates.setHRK(rates.getHRK() / rates.getAUD());
        rates.setHUF(rates.getHUF() / rates.getAUD());
        rates.setIDR(rates.getIDR() / rates.getAUD());
        rates.setILS(rates.getILS() / rates.getAUD());
        rates.setINR(rates.getINR() / rates.getAUD());
        rates.setISK(rates.getISK() / rates.getAUD());
        rates.setJPY(rates.getJPY() / rates.getAUD());
        rates.setKRW(rates.getKRW() / rates.getAUD());
        rates.setMXN(rates.getMXN() / rates.getAUD());
        rates.setMYR(rates.getMYR() / rates.getAUD());
        rates.setNOK(rates.getNOK() / rates.getAUD());
        rates.setNZD(rates.getNZD() / rates.getAUD());
        rates.setPHP(rates.getPHP() / rates.getAUD());
        rates.setPLN(rates.getPLN() / rates.getAUD());
        rates.setRON(rates.getRON() / rates.getAUD());
        rates.setRUB(rates.getRUB() / rates.getAUD());
        rates.setSEK(rates.getSEK() / rates.getAUD());
        rates.setSGD(rates.getSGD() / rates.getAUD());
        rates.setTHB(rates.getTHB() / rates.getAUD());
        rates.setTRY(rates.getTRY() / rates.getAUD());
        rates.setUSD(rates.getUSD() / rates.getAUD());
        rates.setZAR(rates.getZAR() / rates.getAUD());
        rates.setAUD(1);
        return rates;
    }



}
