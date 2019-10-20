package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class ILS extends Currency {

    public ILS(DataSource data, float amount) {
        super(data, amount);
    }




    @Override
    public float getRate() {
        return rates.getILS();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_israel;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.ILS;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.ils;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getILS());
        rates.setBGN(rates.getBGN() / rates.getILS());
        rates.setEUR(rates.getEUR() / rates.getILS());
        rates.setBRL(rates.getBRL() / rates.getILS());
        rates.setCAD(rates.getCAD() / rates.getILS());
        rates.setCHF(rates.getCHF() / rates.getILS());
        rates.setCNY(rates.getCNY() / rates.getILS());
        rates.setCZK(rates.getCZK() / rates.getILS());
        rates.setDKK(rates.getDKK() / rates.getILS());
        rates.setGBP(rates.getGBP() / rates.getILS());
        rates.setHKD(rates.getHKD() / rates.getILS());
        rates.setHRK(rates.getHRK() / rates.getILS());
        rates.setHUF(rates.getHUF() / rates.getILS());
        rates.setIDR(rates.getIDR() / rates.getILS());
        rates.setINR(rates.getINR() / rates.getILS());
        rates.setISK(rates.getISK() / rates.getILS());
        rates.setJPY(rates.getJPY() / rates.getILS());
        rates.setKRW(rates.getKRW() / rates.getILS());
        rates.setMXN(rates.getMXN() / rates.getILS());
        rates.setMYR(rates.getMYR() / rates.getILS());
        rates.setNOK(rates.getNOK() / rates.getILS());
        rates.setNZD(rates.getNZD() / rates.getILS());
        rates.setPHP(rates.getPHP() / rates.getILS());
        rates.setPLN(rates.getPLN() / rates.getILS());
        rates.setRON(rates.getRON() / rates.getILS());
        rates.setRUB(rates.getRUB() / rates.getILS());
        rates.setSEK(rates.getSEK() / rates.getILS());
        rates.setSGD(rates.getSGD() / rates.getILS());
        rates.setTHB(rates.getTHB() / rates.getILS());
        rates.setTRY(rates.getTRY() / rates.getILS());
        rates.setUSD(rates.getUSD() / rates.getILS());
        rates.setZAR(rates.getZAR() / rates.getILS());
        rates.setILS(1);
        return rates;
    }
}
