package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class ISK extends Currency {

    public ISK(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getISK();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_iceland;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.ISK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.isk;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getISK());
        rates.setBGN(rates.getBGN() / rates.getISK());
        rates.setEUR(rates.getEUR() / rates.getISK());
        rates.setBRL(rates.getBRL() / rates.getISK());
        rates.setCAD(rates.getCAD() / rates.getISK());
        rates.setCHF(rates.getCHF() / rates.getISK());
        rates.setCNY(rates.getCNY() / rates.getISK());
        rates.setCZK(rates.getCZK() / rates.getISK());
        rates.setDKK(rates.getDKK() / rates.getISK());
        rates.setGBP(rates.getGBP() / rates.getISK());
        rates.setHKD(rates.getHKD() / rates.getISK());
        rates.setHRK(rates.getHRK() / rates.getISK());
        rates.setHUF(rates.getHUF() / rates.getISK());
        rates.setIDR(rates.getIDR() / rates.getISK());
        rates.setILS(rates.getILS() / rates.getISK());
        rates.setINR(rates.getINR() / rates.getISK());
        rates.setJPY(rates.getJPY() / rates.getISK());
        rates.setKRW(rates.getKRW() / rates.getISK());
        rates.setMXN(rates.getMXN() / rates.getISK());
        rates.setMYR(rates.getMYR() / rates.getISK());
        rates.setNOK(rates.getNOK() / rates.getISK());
        rates.setNZD(rates.getNZD() / rates.getISK());
        rates.setPHP(rates.getPHP() / rates.getISK());
        rates.setPLN(rates.getPLN() / rates.getISK());
        rates.setRON(rates.getRON() / rates.getISK());
        rates.setRUB(rates.getRUB() / rates.getISK());
        rates.setSEK(rates.getSEK() / rates.getISK());
        rates.setSGD(rates.getSGD() / rates.getISK());
        rates.setTHB(rates.getTHB() / rates.getISK());
        rates.setTRY(rates.getTRY() / rates.getISK());
        rates.setUSD(rates.getUSD() / rates.getISK());
        rates.setZAR(rates.getZAR() / rates.getISK());
        rates.setISK(1);
        return rates;
    }


}
