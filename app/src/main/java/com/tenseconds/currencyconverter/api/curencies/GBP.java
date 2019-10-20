package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class GBP extends Currency {

    public GBP(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getGBP();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_united_kingdom;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.GBP;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.gbp;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getGBP());
        rates.setBGN(rates.getBGN() / rates.getGBP());
        rates.setEUR(rates.getEUR() / rates.getGBP());
        rates.setBRL(rates.getBRL() / rates.getGBP());
        rates.setCAD(rates.getCAD() / rates.getGBP());
        rates.setCHF(rates.getCHF() / rates.getGBP());
        rates.setCNY(rates.getCNY() / rates.getGBP());
        rates.setCZK(rates.getCZK() / rates.getGBP());
        rates.setDKK(rates.getDKK() / rates.getGBP());
        rates.setHKD(rates.getHKD() / rates.getGBP());
        rates.setHRK(rates.getHRK() / rates.getGBP());
        rates.setHUF(rates.getHUF() / rates.getGBP());
        rates.setIDR(rates.getIDR() / rates.getGBP());
        rates.setILS(rates.getILS() / rates.getGBP());
        rates.setINR(rates.getINR() / rates.getGBP());
        rates.setISK(rates.getISK() / rates.getGBP());
        rates.setJPY(rates.getJPY() / rates.getGBP());
        rates.setKRW(rates.getKRW() / rates.getGBP());
        rates.setMXN(rates.getMXN() / rates.getGBP());
        rates.setMYR(rates.getMYR() / rates.getGBP());
        rates.setNOK(rates.getNOK() / rates.getGBP());
        rates.setNZD(rates.getNZD() / rates.getGBP());
        rates.setPHP(rates.getPHP() / rates.getGBP());
        rates.setPLN(rates.getPLN() / rates.getGBP());
        rates.setRON(rates.getRON() / rates.getGBP());
        rates.setRUB(rates.getRUB() / rates.getGBP());
        rates.setSEK(rates.getSEK() / rates.getGBP());
        rates.setSGD(rates.getSGD() / rates.getGBP());
        rates.setTHB(rates.getTHB() / rates.getGBP());
        rates.setTRY(rates.getTRY() / rates.getGBP());
        rates.setUSD(rates.getUSD() / rates.getGBP());
        rates.setZAR(rates.getZAR() / rates.getGBP());
        rates.setGBP(1);
        return rates;
    }

}
