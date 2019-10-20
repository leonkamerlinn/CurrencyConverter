package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class EUR extends Currency {

    public EUR(DataSource data, float amount) {
        super(data, amount);
    }
    @Override
    public float getRate() {
        return rates.getEUR();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_european_union;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.EUR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.eur;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getEUR());
        rates.setBGN(rates.getBGN() / rates.getEUR());
        rates.setBRL(rates.getBRL() / rates.getEUR());
        rates.setCAD(rates.getCAD() / rates.getEUR());
        rates.setCHF(rates.getCHF() / rates.getEUR());
        rates.setCNY(rates.getCNY() / rates.getEUR());
        rates.setCZK(rates.getCZK() / rates.getEUR());
        rates.setDKK(rates.getDKK() / rates.getEUR());
        rates.setGBP(rates.getGBP() / rates.getEUR());
        rates.setHKD(rates.getHKD() / rates.getEUR());
        rates.setHRK(rates.getHRK() / rates.getEUR());
        rates.setHUF(rates.getHUF() / rates.getEUR());
        rates.setIDR(rates.getIDR() / rates.getEUR());
        rates.setILS(rates.getILS() / rates.getEUR());
        rates.setINR(rates.getINR() / rates.getEUR());
        rates.setISK(rates.getISK() / rates.getEUR());
        rates.setJPY(rates.getJPY() / rates.getEUR());
        rates.setKRW(rates.getKRW() / rates.getEUR());
        rates.setMXN(rates.getMXN() / rates.getEUR());
        rates.setMYR(rates.getMYR() / rates.getEUR());
        rates.setNOK(rates.getNOK() / rates.getEUR());
        rates.setNZD(rates.getNZD() / rates.getEUR());
        rates.setPHP(rates.getPHP() / rates.getEUR());
        rates.setPLN(rates.getPLN() / rates.getEUR());
        rates.setRON(rates.getRON() / rates.getEUR());
        rates.setRUB(rates.getRUB() / rates.getEUR());
        rates.setSEK(rates.getSEK() / rates.getEUR());
        rates.setSGD(rates.getSGD() / rates.getEUR());
        rates.setTHB(rates.getTHB() / rates.getEUR());
        rates.setTRY(rates.getTRY() / rates.getEUR());
        rates.setUSD(rates.getUSD() / rates.getEUR());
        rates.setZAR(rates.getZAR() / rates.getEUR());
        rates.setEUR(1);
        return rates;
    }


}
