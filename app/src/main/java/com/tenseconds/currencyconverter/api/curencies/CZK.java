package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class CZK extends Currency {
    public CZK(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getCZK();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_czech_republic;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CZK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.czk;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getCZK());
        rates.setBGN(rates.getBGN() / rates.getCZK());
        rates.setEUR(rates.getEUR() / rates.getCZK());
        rates.setBRL(rates.getBRL() / rates.getCZK());
        rates.setCAD(rates.getCAD() / rates.getCZK());
        rates.setCHF(rates.getCHF() / rates.getCZK());
        rates.setCNY(rates.getCNY() / rates.getCZK());
        rates.setDKK(rates.getDKK() / rates.getCZK());
        rates.setGBP(rates.getGBP() / rates.getCZK());
        rates.setHKD(rates.getHKD() / rates.getCZK());
        rates.setHRK(rates.getHRK() / rates.getCZK());
        rates.setHUF(rates.getHUF() / rates.getCZK());
        rates.setIDR(rates.getIDR() / rates.getCZK());
        rates.setILS(rates.getILS() / rates.getCZK());
        rates.setINR(rates.getINR() / rates.getCZK());
        rates.setISK(rates.getISK() / rates.getCZK());
        rates.setJPY(rates.getJPY() / rates.getCZK());
        rates.setKRW(rates.getKRW() / rates.getCZK());
        rates.setMXN(rates.getMXN() / rates.getCZK());
        rates.setMYR(rates.getMYR() / rates.getCZK());
        rates.setNOK(rates.getNOK() / rates.getCZK());
        rates.setNZD(rates.getNZD() / rates.getCZK());
        rates.setPHP(rates.getPHP() / rates.getCZK());
        rates.setPLN(rates.getPLN() / rates.getCZK());
        rates.setRON(rates.getRON() / rates.getCZK());
        rates.setRUB(rates.getRUB() / rates.getCZK());
        rates.setSEK(rates.getSEK() / rates.getCZK());
        rates.setSGD(rates.getSGD() / rates.getCZK());
        rates.setTHB(rates.getTHB() / rates.getCZK());
        rates.setTRY(rates.getTRY() / rates.getCZK());
        rates.setUSD(rates.getUSD() / rates.getCZK());
        rates.setZAR(rates.getZAR() / rates.getCZK());
        rates.setCZK(1);
        return rates;
    }


}
