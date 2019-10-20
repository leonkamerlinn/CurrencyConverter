package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class CHF extends Currency {

    public CHF(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getCHF();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_switzerland;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CHF;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.chf;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getCHF());
        rates.setBGN(rates.getBGN() / rates.getCHF());
        rates.setEUR(rates.getEUR() / rates.getCHF());
        rates.setBRL(rates.getBRL() / rates.getCHF());
        rates.setCAD(rates.getCAD() / rates.getCHF());
        rates.setCNY(rates.getCNY() / rates.getCHF());
        rates.setCZK(rates.getCZK() / rates.getCHF());
        rates.setDKK(rates.getDKK() / rates.getCHF());
        rates.setGBP(rates.getGBP() / rates.getCHF());
        rates.setHKD(rates.getHKD() / rates.getCHF());
        rates.setHRK(rates.getHRK() / rates.getCHF());
        rates.setHUF(rates.getHUF() / rates.getCHF());
        rates.setIDR(rates.getIDR() / rates.getCHF());
        rates.setILS(rates.getILS() / rates.getCHF());
        rates.setINR(rates.getINR() / rates.getCHF());
        rates.setISK(rates.getISK() / rates.getCHF());
        rates.setJPY(rates.getJPY() / rates.getCHF());
        rates.setKRW(rates.getKRW() / rates.getCHF());
        rates.setMXN(rates.getMXN() / rates.getCHF());
        rates.setMYR(rates.getMYR() / rates.getCHF());
        rates.setNOK(rates.getNOK() / rates.getCHF());
        rates.setNZD(rates.getNZD() / rates.getCHF());
        rates.setPHP(rates.getPHP() / rates.getCHF());
        rates.setPLN(rates.getPLN() / rates.getCHF());
        rates.setRON(rates.getRON() / rates.getCHF());
        rates.setRUB(rates.getRUB() / rates.getCHF());
        rates.setSEK(rates.getSEK() / rates.getCHF());
        rates.setSGD(rates.getSGD() / rates.getCHF());
        rates.setTHB(rates.getTHB() / rates.getCHF());
        rates.setTRY(rates.getTRY() / rates.getCHF());
        rates.setUSD(rates.getUSD() / rates.getCHF());
        rates.setZAR(rates.getZAR() / rates.getCHF());
        rates.setCHF(1);
        return rates;
    }


}
