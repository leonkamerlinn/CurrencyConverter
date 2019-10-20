package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class HRK extends Currency {

    public HRK(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getHRK();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_croatia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.HRK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.hrk;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getHRK());
        rates.setBGN(rates.getBGN() / rates.getHRK());
        rates.setEUR(rates.getEUR() / rates.getHRK());
        rates.setBRL(rates.getBRL() / rates.getHRK());
        rates.setCAD(rates.getCAD() / rates.getHRK());
        rates.setCHF(rates.getCHF() / rates.getHRK());
        rates.setCNY(rates.getCNY() / rates.getHRK());
        rates.setCZK(rates.getCZK() / rates.getHRK());
        rates.setDKK(rates.getDKK() / rates.getHRK());
        rates.setGBP(rates.getGBP() / rates.getHRK());
        rates.setHKD(rates.getHKD() / rates.getHRK());
        rates.setHUF(rates.getHUF() / rates.getHRK());
        rates.setIDR(rates.getIDR() / rates.getHRK());
        rates.setILS(rates.getILS() / rates.getHRK());
        rates.setINR(rates.getINR() / rates.getHRK());
        rates.setISK(rates.getISK() / rates.getHRK());
        rates.setJPY(rates.getJPY() / rates.getHRK());
        rates.setKRW(rates.getKRW() / rates.getHRK());
        rates.setMXN(rates.getMXN() / rates.getHRK());
        rates.setMYR(rates.getMYR() / rates.getHRK());
        rates.setNOK(rates.getNOK() / rates.getHRK());
        rates.setNZD(rates.getNZD() / rates.getHRK());
        rates.setPHP(rates.getPHP() / rates.getHRK());
        rates.setPLN(rates.getPLN() / rates.getHRK());
        rates.setRON(rates.getRON() / rates.getHRK());
        rates.setRUB(rates.getRUB() / rates.getHRK());
        rates.setSEK(rates.getSEK() / rates.getHRK());
        rates.setSGD(rates.getSGD() / rates.getHRK());
        rates.setTHB(rates.getTHB() / rates.getHRK());
        rates.setTRY(rates.getTRY() / rates.getHRK());
        rates.setUSD(rates.getUSD() / rates.getHRK());
        rates.setZAR(rates.getZAR() / rates.getHRK());
        rates.setHRK(1);
        return rates;
    }


}
