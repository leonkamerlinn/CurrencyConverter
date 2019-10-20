package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class MYR extends Currency {

    public MYR(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getMYR();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_malaysia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.MYR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.myr;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getMYR());
        rates.setBGN(rates.getBGN() / rates.getMYR());
        rates.setEUR(rates.getEUR() / rates.getMYR());
        rates.setBRL(rates.getBRL() / rates.getMYR());
        rates.setCAD(rates.getCAD() / rates.getMYR());
        rates.setCHF(rates.getCHF() / rates.getMYR());
        rates.setCNY(rates.getCNY() / rates.getMYR());
        rates.setCZK(rates.getCZK() / rates.getMYR());
        rates.setDKK(rates.getDKK() / rates.getMYR());
        rates.setGBP(rates.getGBP() / rates.getMYR());
        rates.setHKD(rates.getHKD() / rates.getMYR());
        rates.setHRK(rates.getHRK() / rates.getMYR());
        rates.setHUF(rates.getHUF() / rates.getMYR());
        rates.setIDR(rates.getIDR() / rates.getMYR());
        rates.setILS(rates.getILS() / rates.getMYR());
        rates.setINR(rates.getINR() / rates.getMYR());
        rates.setISK(rates.getISK() / rates.getMYR());
        rates.setJPY(rates.getJPY() / rates.getMYR());
        rates.setKRW(rates.getKRW() / rates.getMYR());
        rates.setMXN(rates.getMXN() / rates.getMYR());
        rates.setNOK(rates.getNOK() / rates.getMYR());
        rates.setNZD(rates.getNZD() / rates.getMYR());
        rates.setPHP(rates.getPHP() / rates.getMYR());
        rates.setPLN(rates.getPLN() / rates.getMYR());
        rates.setRON(rates.getRON() / rates.getMYR());
        rates.setRUB(rates.getRUB() / rates.getMYR());
        rates.setSEK(rates.getSEK() / rates.getMYR());
        rates.setSGD(rates.getSGD() / rates.getMYR());
        rates.setTHB(rates.getTHB() / rates.getMYR());
        rates.setTRY(rates.getTRY() / rates.getMYR());
        rates.setUSD(rates.getUSD() / rates.getMYR());
        rates.setZAR(rates.getZAR() / rates.getMYR());
        rates.setMYR(1);
        return rates;
    }


}
