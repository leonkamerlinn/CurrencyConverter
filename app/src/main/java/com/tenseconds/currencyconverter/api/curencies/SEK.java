package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class SEK extends Currency {
    public SEK(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getSEK();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_sweden;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.SEK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.sek;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getSEK());
        rates.setBGN(rates.getBGN() / rates.getSEK());
        rates.setEUR(rates.getEUR() / rates.getSEK());
        rates.setBRL(rates.getBRL() / rates.getSEK());
        rates.setCAD(rates.getCAD() / rates.getSEK());
        rates.setCHF(rates.getCHF() / rates.getSEK());
        rates.setCNY(rates.getCNY() / rates.getSEK());
        rates.setCZK(rates.getCZK() / rates.getSEK());
        rates.setDKK(rates.getDKK() / rates.getSEK());
        rates.setGBP(rates.getGBP() / rates.getSEK());
        rates.setHKD(rates.getHKD() / rates.getSEK());
        rates.setHRK(rates.getHRK() / rates.getSEK());
        rates.setHUF(rates.getHUF() / rates.getSEK());
        rates.setIDR(rates.getIDR() / rates.getSEK());
        rates.setILS(rates.getILS() / rates.getSEK());
        rates.setINR(rates.getINR() / rates.getSEK());
        rates.setISK(rates.getISK() / rates.getSEK());
        rates.setJPY(rates.getJPY() / rates.getSEK());
        rates.setKRW(rates.getKRW() / rates.getSEK());
        rates.setMXN(rates.getMXN() / rates.getSEK());
        rates.setMYR(rates.getMYR() / rates.getSEK());
        rates.setNOK(rates.getNOK() / rates.getSEK());
        rates.setNZD(rates.getNZD() / rates.getSEK());
        rates.setPHP(rates.getPHP() / rates.getSEK());
        rates.setPLN(rates.getPLN() / rates.getSEK());
        rates.setRON(rates.getRON() / rates.getSEK());
        rates.setRUB(rates.getRUB() / rates.getSEK());
        rates.setSGD(rates.getSGD() / rates.getSEK());
        rates.setTHB(rates.getTHB() / rates.getSEK());
        rates.setTRY(rates.getTRY() / rates.getSEK());
        rates.setUSD(rates.getUSD() / rates.getSEK());
        rates.setZAR(rates.getZAR() / rates.getSEK());
        rates.setSEK(1);
        return rates;
    }


}
