package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class TRY extends Currency {
    public TRY(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getTRY();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_turkey;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.TRY;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.turkish_lira;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getTRY());
        rates.setBGN(rates.getBGN() / rates.getTRY());
        rates.setEUR(rates.getEUR() / rates.getTRY());
        rates.setBRL(rates.getBRL() / rates.getTRY());
        rates.setCAD(rates.getCAD() / rates.getTRY());
        rates.setCHF(rates.getCHF() / rates.getTRY());
        rates.setCNY(rates.getCNY() / rates.getTRY());
        rates.setCZK(rates.getCZK() / rates.getTRY());
        rates.setDKK(rates.getDKK() / rates.getTRY());
        rates.setGBP(rates.getGBP() / rates.getTRY());
        rates.setHKD(rates.getHKD() / rates.getTRY());
        rates.setHRK(rates.getHRK() / rates.getTRY());
        rates.setHUF(rates.getHUF() / rates.getTRY());
        rates.setIDR(rates.getIDR() / rates.getTRY());
        rates.setILS(rates.getILS() / rates.getTRY());
        rates.setINR(rates.getINR() / rates.getTRY());
        rates.setISK(rates.getISK() / rates.getTRY());
        rates.setJPY(rates.getJPY() / rates.getTRY());
        rates.setKRW(rates.getKRW() / rates.getTRY());
        rates.setMXN(rates.getMXN() / rates.getTRY());
        rates.setMYR(rates.getMYR() / rates.getTRY());
        rates.setNOK(rates.getNOK() / rates.getTRY());
        rates.setNZD(rates.getNZD() / rates.getTRY());
        rates.setPHP(rates.getPHP() / rates.getTRY());
        rates.setPLN(rates.getPLN() / rates.getTRY());
        rates.setRON(rates.getRON() / rates.getTRY());
        rates.setRUB(rates.getRUB() / rates.getTRY());
        rates.setSEK(rates.getSEK() / rates.getTRY());
        rates.setSGD(rates.getSGD() / rates.getTRY());
        rates.setTHB(rates.getTHB() / rates.getTRY());
        rates.setUSD(rates.getUSD() / rates.getTRY());
        rates.setZAR(rates.getZAR() / rates.getTRY());
        rates.setTRY(1);
        return rates;
    }

}
