package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class CNY extends Currency {

    public CNY(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getCNY();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_china;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CNY;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.cny;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getCNY());
        rates.setBGN(rates.getBGN() / rates.getCNY());
        rates.setEUR(rates.getEUR() / rates.getCNY());
        rates.setBRL(rates.getBRL() / rates.getCNY());
        rates.setCAD(rates.getCAD() / rates.getCNY());
        rates.setCHF(rates.getCHF() / rates.getCNY());
        rates.setCZK(rates.getCZK() / rates.getCNY());
        rates.setDKK(rates.getDKK() / rates.getCNY());
        rates.setGBP(rates.getGBP() / rates.getCNY());
        rates.setHKD(rates.getHKD() / rates.getCNY());
        rates.setHRK(rates.getHRK() / rates.getCNY());
        rates.setHUF(rates.getHUF() / rates.getCNY());
        rates.setIDR(rates.getIDR() / rates.getCNY());
        rates.setILS(rates.getILS() / rates.getCNY());
        rates.setINR(rates.getINR() / rates.getCNY());
        rates.setISK(rates.getISK() / rates.getCNY());
        rates.setJPY(rates.getJPY() / rates.getCNY());
        rates.setKRW(rates.getKRW() / rates.getCNY());
        rates.setMXN(rates.getMXN() / rates.getCNY());
        rates.setMYR(rates.getMYR() / rates.getCNY());
        rates.setNOK(rates.getNOK() / rates.getCNY());
        rates.setNZD(rates.getNZD() / rates.getCNY());
        rates.setPHP(rates.getPHP() / rates.getCNY());
        rates.setPLN(rates.getPLN() / rates.getCNY());
        rates.setRON(rates.getRON() / rates.getCNY());
        rates.setRUB(rates.getRUB() / rates.getCNY());
        rates.setSEK(rates.getSEK() / rates.getCNY());
        rates.setSGD(rates.getSGD() / rates.getCNY());
        rates.setTHB(rates.getTHB() / rates.getCNY());
        rates.setTRY(rates.getTRY() / rates.getCNY());
        rates.setUSD(rates.getUSD() / rates.getCNY());
        rates.setZAR(rates.getZAR() / rates.getCNY());
        rates.setCNY(1);
        return rates;
    }

}
