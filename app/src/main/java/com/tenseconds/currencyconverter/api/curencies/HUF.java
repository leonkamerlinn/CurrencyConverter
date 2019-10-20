package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class HUF extends Currency {

    public HUF(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getHUF();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_hungary;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.HUF;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.huf;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getHUF());
        rates.setBGN(rates.getBGN() / rates.getHUF());
        rates.setEUR(rates.getEUR() / rates.getHUF());
        rates.setBRL(rates.getBRL() / rates.getHUF());
        rates.setCAD(rates.getCAD() / rates.getHUF());
        rates.setCHF(rates.getCHF() / rates.getHUF());
        rates.setCNY(rates.getCNY() / rates.getHUF());
        rates.setCZK(rates.getCZK() / rates.getHUF());
        rates.setDKK(rates.getDKK() / rates.getHUF());
        rates.setGBP(rates.getGBP() / rates.getHUF());
        rates.setHKD(rates.getHKD() / rates.getHUF());
        rates.setHRK(rates.getHRK() / rates.getHUF());
        rates.setIDR(rates.getIDR() / rates.getHUF());
        rates.setILS(rates.getILS() / rates.getHUF());
        rates.setINR(rates.getINR() / rates.getHUF());
        rates.setISK(rates.getISK() / rates.getHUF());
        rates.setJPY(rates.getJPY() / rates.getHUF());
        rates.setKRW(rates.getKRW() / rates.getHUF());
        rates.setMXN(rates.getMXN() / rates.getHUF());
        rates.setMYR(rates.getMYR() / rates.getHUF());
        rates.setNOK(rates.getNOK() / rates.getHUF());
        rates.setNZD(rates.getNZD() / rates.getHUF());
        rates.setPHP(rates.getPHP() / rates.getHUF());
        rates.setPLN(rates.getPLN() / rates.getHUF());
        rates.setRON(rates.getRON() / rates.getHUF());
        rates.setRUB(rates.getRUB() / rates.getHUF());
        rates.setSEK(rates.getSEK() / rates.getHUF());
        rates.setSGD(rates.getSGD() / rates.getHUF());
        rates.setTHB(rates.getTHB() / rates.getHUF());
        rates.setTRY(rates.getTRY() / rates.getHUF());
        rates.setUSD(rates.getUSD() / rates.getHUF());
        rates.setZAR(rates.getZAR() / rates.getHUF());
        rates.setHUF(1);
        return rates;
    }

}
