package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class KRW extends Currency {

    public KRW(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getKRW();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_south_korea;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.KRW;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.krw;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getKRW());
        rates.setBGN(rates.getBGN() / rates.getKRW());
        rates.setEUR(rates.getEUR() / rates.getKRW());
        rates.setBRL(rates.getBRL() / rates.getKRW());
        rates.setCAD(rates.getCAD() / rates.getKRW());
        rates.setCHF(rates.getCHF() / rates.getKRW());
        rates.setCNY(rates.getCNY() / rates.getKRW());
        rates.setCZK(rates.getCZK() / rates.getKRW());
        rates.setDKK(rates.getDKK() / rates.getKRW());
        rates.setGBP(rates.getGBP() / rates.getKRW());
        rates.setHKD(rates.getHKD() / rates.getKRW());
        rates.setHRK(rates.getHRK() / rates.getKRW());
        rates.setHUF(rates.getHUF() / rates.getKRW());
        rates.setIDR(rates.getIDR() / rates.getKRW());
        rates.setILS(rates.getILS() / rates.getKRW());
        rates.setINR(rates.getINR() / rates.getKRW());
        rates.setISK(rates.getISK() / rates.getKRW());
        rates.setJPY(rates.getJPY() / rates.getKRW());
        rates.setMXN(rates.getMXN() / rates.getKRW());
        rates.setMYR(rates.getMYR() / rates.getKRW());
        rates.setNOK(rates.getNOK() / rates.getKRW());
        rates.setNZD(rates.getNZD() / rates.getKRW());
        rates.setPHP(rates.getPHP() / rates.getKRW());
        rates.setPLN(rates.getPLN() / rates.getKRW());
        rates.setRON(rates.getRON() / rates.getKRW());
        rates.setRUB(rates.getRUB() / rates.getKRW());
        rates.setSEK(rates.getSEK() / rates.getKRW());
        rates.setSGD(rates.getSGD() / rates.getKRW());
        rates.setTHB(rates.getTHB() / rates.getKRW());
        rates.setTRY(rates.getTRY() / rates.getKRW());
        rates.setUSD(rates.getUSD() / rates.getKRW());
        rates.setZAR(rates.getZAR() / rates.getKRW());
        rates.setKRW(1);
        return rates;
    }

}
