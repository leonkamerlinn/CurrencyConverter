package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class RUB extends Currency {

    public RUB(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getRUB();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_russia;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.RUB;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.rub;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getRUB());
        rates.setBGN(rates.getBGN() / rates.getRUB());
        rates.setEUR(rates.getEUR() / rates.getRUB());
        rates.setBRL(rates.getBRL() / rates.getRUB());
        rates.setCAD(rates.getCAD() / rates.getRUB());
        rates.setCHF(rates.getCHF() / rates.getRUB());
        rates.setCNY(rates.getCNY() / rates.getRUB());
        rates.setCZK(rates.getCZK() / rates.getRUB());
        rates.setDKK(rates.getDKK() / rates.getRUB());
        rates.setGBP(rates.getGBP() / rates.getRUB());
        rates.setHKD(rates.getHKD() / rates.getRUB());
        rates.setHRK(rates.getHRK() / rates.getRUB());
        rates.setHUF(rates.getHUF() / rates.getRUB());
        rates.setIDR(rates.getIDR() / rates.getRUB());
        rates.setILS(rates.getILS() / rates.getRUB());
        rates.setINR(rates.getINR() / rates.getRUB());
        rates.setISK(rates.getISK() / rates.getRUB());
        rates.setJPY(rates.getJPY() / rates.getRUB());
        rates.setKRW(rates.getKRW() / rates.getRUB());
        rates.setMXN(rates.getMXN() / rates.getRUB());
        rates.setMYR(rates.getMYR() / rates.getRUB());
        rates.setNOK(rates.getNOK() / rates.getRUB());
        rates.setNZD(rates.getNZD() / rates.getRUB());
        rates.setPHP(rates.getPHP() / rates.getRUB());
        rates.setPLN(rates.getPLN() / rates.getRUB());
        rates.setRON(rates.getRON() / rates.getRUB());
        rates.setSEK(rates.getSEK() / rates.getRUB());
        rates.setSGD(rates.getSGD() / rates.getRUB());
        rates.setTHB(rates.getTHB() / rates.getRUB());
        rates.setTRY(rates.getTRY() / rates.getRUB());
        rates.setUSD(rates.getUSD() / rates.getRUB());
        rates.setZAR(rates.getZAR() / rates.getRUB());
        rates.setRUB(1);
        return rates;
    }


}
