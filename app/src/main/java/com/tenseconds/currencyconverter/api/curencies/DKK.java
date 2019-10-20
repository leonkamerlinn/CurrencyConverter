package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class DKK extends Currency {

    public DKK(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getDKK();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_denmark;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.DKK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.dkk;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getDKK());
        rates.setBGN(rates.getBGN() / rates.getDKK());
        rates.setEUR(rates.getEUR() / rates.getDKK());
        rates.setBRL(rates.getBRL() / rates.getDKK());
        rates.setCAD(rates.getCAD() / rates.getDKK());
        rates.setCHF(rates.getCHF() / rates.getDKK());
        rates.setCNY(rates.getCNY() / rates.getDKK());
        rates.setCZK(rates.getCZK() / rates.getDKK());
        rates.setGBP(rates.getGBP() / rates.getDKK());
        rates.setHKD(rates.getHKD() / rates.getDKK());
        rates.setHRK(rates.getHRK() / rates.getDKK());
        rates.setHUF(rates.getHUF() / rates.getDKK());
        rates.setIDR(rates.getIDR() / rates.getDKK());
        rates.setILS(rates.getILS() / rates.getDKK());
        rates.setINR(rates.getINR() / rates.getDKK());
        rates.setISK(rates.getISK() / rates.getDKK());
        rates.setJPY(rates.getJPY() / rates.getDKK());
        rates.setKRW(rates.getKRW() / rates.getDKK());
        rates.setMXN(rates.getMXN() / rates.getDKK());
        rates.setMYR(rates.getMYR() / rates.getDKK());
        rates.setNOK(rates.getNOK() / rates.getDKK());
        rates.setNZD(rates.getNZD() / rates.getDKK());
        rates.setPHP(rates.getPHP() / rates.getDKK());
        rates.setPLN(rates.getPLN() / rates.getDKK());
        rates.setRON(rates.getRON() / rates.getDKK());
        rates.setRUB(rates.getRUB() / rates.getDKK());
        rates.setSEK(rates.getSEK() / rates.getDKK());
        rates.setSGD(rates.getSGD() / rates.getDKK());
        rates.setTHB(rates.getTHB() / rates.getDKK());
        rates.setTRY(rates.getTRY() / rates.getDKK());
        rates.setUSD(rates.getUSD() / rates.getDKK());
        rates.setZAR(rates.getZAR() / rates.getDKK());
        rates.setDKK(1);
        return rates;
    }


}
