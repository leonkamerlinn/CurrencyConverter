package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class INR extends Currency {

    public INR(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getINR();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_india;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.INR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.inr;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getINR());
        rates.setBGN(rates.getBGN() / rates.getINR());
        rates.setEUR(rates.getEUR() / rates.getINR());
        rates.setBRL(rates.getBRL() / rates.getINR());
        rates.setCAD(rates.getCAD() / rates.getINR());
        rates.setCHF(rates.getCHF() / rates.getINR());
        rates.setCNY(rates.getCNY() / rates.getINR());
        rates.setCZK(rates.getCZK() / rates.getINR());
        rates.setDKK(rates.getDKK() / rates.getINR());
        rates.setGBP(rates.getGBP() / rates.getINR());
        rates.setHKD(rates.getHKD() / rates.getINR());
        rates.setHRK(rates.getHRK() / rates.getINR());
        rates.setHUF(rates.getHUF() / rates.getINR());
        rates.setIDR(rates.getIDR() / rates.getINR());
        rates.setILS(rates.getILS() / rates.getINR());
        rates.setISK(rates.getISK() / rates.getINR());
        rates.setJPY(rates.getJPY() / rates.getINR());
        rates.setKRW(rates.getKRW() / rates.getINR());
        rates.setMXN(rates.getMXN() / rates.getINR());
        rates.setMYR(rates.getMYR() / rates.getINR());
        rates.setNOK(rates.getNOK() / rates.getINR());
        rates.setNZD(rates.getNZD() / rates.getINR());
        rates.setPHP(rates.getPHP() / rates.getINR());
        rates.setPLN(rates.getPLN() / rates.getINR());
        rates.setRON(rates.getRON() / rates.getINR());
        rates.setRUB(rates.getRUB() / rates.getINR());
        rates.setSEK(rates.getSEK() / rates.getINR());
        rates.setSGD(rates.getSGD() / rates.getINR());
        rates.setTHB(rates.getTHB() / rates.getINR());
        rates.setTRY(rates.getTRY() / rates.getINR());
        rates.setUSD(rates.getUSD() / rates.getINR());
        rates.setZAR(rates.getZAR() / rates.getINR());
        rates.setINR(1);
        return rates;
    }


}
