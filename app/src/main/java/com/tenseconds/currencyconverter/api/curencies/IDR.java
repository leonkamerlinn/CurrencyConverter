package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class IDR extends Currency {

    public IDR(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getIDR();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_indonesia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.IDR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.idr;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getIDR());
        rates.setBGN(rates.getBGN() / rates.getIDR());
        rates.setEUR(rates.getEUR() / rates.getIDR());
        rates.setBRL(rates.getBRL() / rates.getIDR());
        rates.setCAD(rates.getCAD() / rates.getIDR());
        rates.setCHF(rates.getCHF() / rates.getIDR());
        rates.setCNY(rates.getCNY() / rates.getIDR());
        rates.setCZK(rates.getCZK() / rates.getIDR());
        rates.setDKK(rates.getDKK() / rates.getIDR());
        rates.setGBP(rates.getGBP() / rates.getIDR());
        rates.setHKD(rates.getHKD() / rates.getIDR());
        rates.setHRK(rates.getHRK() / rates.getIDR());
        rates.setHUF(rates.getHUF() / rates.getIDR());
        rates.setILS(rates.getILS() / rates.getIDR());
        rates.setINR(rates.getINR() / rates.getIDR());
        rates.setISK(rates.getISK() / rates.getIDR());
        rates.setJPY(rates.getJPY() / rates.getIDR());
        rates.setKRW(rates.getKRW() / rates.getIDR());
        rates.setMXN(rates.getMXN() / rates.getIDR());
        rates.setMYR(rates.getMYR() / rates.getIDR());
        rates.setNOK(rates.getNOK() / rates.getIDR());
        rates.setNZD(rates.getNZD() / rates.getIDR());
        rates.setPHP(rates.getPHP() / rates.getIDR());
        rates.setPLN(rates.getPLN() / rates.getIDR());
        rates.setRON(rates.getRON() / rates.getIDR());
        rates.setRUB(rates.getRUB() / rates.getIDR());
        rates.setSEK(rates.getSEK() / rates.getIDR());
        rates.setSGD(rates.getSGD() / rates.getIDR());
        rates.setTHB(rates.getTHB() / rates.getIDR());
        rates.setTRY(rates.getTRY() / rates.getIDR());
        rates.setUSD(rates.getUSD() / rates.getIDR());
        rates.setZAR(rates.getZAR() / rates.getIDR());
        rates.setIDR(1);
        return rates;
    }


}
