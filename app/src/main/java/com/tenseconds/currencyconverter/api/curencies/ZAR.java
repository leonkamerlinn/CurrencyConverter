package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class ZAR extends Currency {

    public ZAR(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getZAR();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_south_africa;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.ZAR;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.zar;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getZAR());
        rates.setBGN(rates.getBGN() / rates.getZAR());
        rates.setEUR(rates.getEUR() / rates.getZAR());
        rates.setBRL(rates.getBRL() / rates.getZAR());
        rates.setCAD(rates.getCAD() / rates.getZAR());
        rates.setCHF(rates.getCHF() / rates.getZAR());
        rates.setCNY(rates.getCNY() / rates.getZAR());
        rates.setCZK(rates.getCZK() / rates.getZAR());
        rates.setDKK(rates.getDKK() / rates.getZAR());
        rates.setGBP(rates.getGBP() / rates.getZAR());
        rates.setHKD(rates.getHKD() / rates.getZAR());
        rates.setHRK(rates.getHRK() / rates.getZAR());
        rates.setHUF(rates.getHUF() / rates.getZAR());
        rates.setIDR(rates.getIDR() / rates.getZAR());
        rates.setILS(rates.getILS() / rates.getZAR());
        rates.setINR(rates.getINR() / rates.getZAR());
        rates.setISK(rates.getISK() / rates.getZAR());
        rates.setJPY(rates.getJPY() / rates.getZAR());
        rates.setKRW(rates.getKRW() / rates.getZAR());
        rates.setMXN(rates.getMXN() / rates.getZAR());
        rates.setMYR(rates.getMYR() / rates.getZAR());
        rates.setNOK(rates.getNOK() / rates.getZAR());
        rates.setNZD(rates.getNZD() / rates.getZAR());
        rates.setPHP(rates.getPHP() / rates.getZAR());
        rates.setPLN(rates.getPLN() / rates.getZAR());
        rates.setRON(rates.getRON() / rates.getZAR());
        rates.setRUB(rates.getRUB() / rates.getZAR());
        rates.setSEK(rates.getSEK() / rates.getZAR());
        rates.setSGD(rates.getSGD() / rates.getZAR());
        rates.setTHB(rates.getTHB() / rates.getZAR());
        rates.setTRY(rates.getTRY() / rates.getZAR());
        rates.setUSD(rates.getUSD() / rates.getZAR());
        rates.setZAR(1);
        return rates;
    }


}
