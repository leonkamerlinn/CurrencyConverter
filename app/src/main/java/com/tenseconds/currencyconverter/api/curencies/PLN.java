package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class PLN extends Currency {
    public PLN(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getPLN();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_poland;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.PLN;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.pln;
    }

    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getPLN());
        rates.setBGN(rates.getBGN() / rates.getPLN());
        rates.setEUR(rates.getEUR() / rates.getPLN());
        rates.setBRL(rates.getBRL() / rates.getPLN());
        rates.setCAD(rates.getCAD() / rates.getPLN());
        rates.setCHF(rates.getCHF() / rates.getPLN());
        rates.setCNY(rates.getCNY() / rates.getPLN());
        rates.setCZK(rates.getCZK() / rates.getPLN());
        rates.setDKK(rates.getDKK() / rates.getPLN());
        rates.setGBP(rates.getGBP() / rates.getPLN());
        rates.setHKD(rates.getHKD() / rates.getPLN());
        rates.setHRK(rates.getHRK() / rates.getPLN());
        rates.setHUF(rates.getHUF() / rates.getPLN());
        rates.setIDR(rates.getIDR() / rates.getPLN());
        rates.setILS(rates.getILS() / rates.getPLN());
        rates.setINR(rates.getINR() / rates.getPLN());
        rates.setISK(rates.getISK() / rates.getPLN());
        rates.setJPY(rates.getJPY() / rates.getPLN());
        rates.setKRW(rates.getKRW() / rates.getPLN());
        rates.setMXN(rates.getMXN() / rates.getPLN());
        rates.setMYR(rates.getMYR() / rates.getPLN());
        rates.setNOK(rates.getNOK() / rates.getPLN());
        rates.setNZD(rates.getNZD() / rates.getPLN());
        rates.setPLN(rates.getPLN() / rates.getPLN());
        rates.setRON(rates.getRON() / rates.getPLN());
        rates.setRUB(rates.getRUB() / rates.getPLN());
        rates.setSEK(rates.getSEK() / rates.getPLN());
        rates.setSGD(rates.getSGD() / rates.getPLN());
        rates.setTHB(rates.getTHB() / rates.getPLN());
        rates.setTRY(rates.getTRY() / rates.getPLN());
        rates.setUSD(rates.getUSD() / rates.getPLN());
        rates.setZAR(rates.getZAR() / rates.getPLN());
        rates.setPLN(1);
        return rates;
    }


}
