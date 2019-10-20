package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class CAD extends Currency {

    public CAD(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getCAD();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_canada;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.CAD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.cad;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getCAD());
        rates.setBGN(rates.getBGN() / rates.getCAD());
        rates.setEUR(rates.getEUR() / rates.getCAD());
        rates.setBRL(rates.getBRL() / rates.getCAD());
        rates.setCHF(rates.getCHF() / rates.getCAD());
        rates.setCNY(rates.getCNY() / rates.getCAD());
        rates.setCZK(rates.getCZK() / rates.getCAD());
        rates.setDKK(rates.getDKK() / rates.getCAD());
        rates.setGBP(rates.getGBP() / rates.getCAD());
        rates.setHKD(rates.getHKD() / rates.getCAD());
        rates.setHRK(rates.getHRK() / rates.getCAD());
        rates.setHUF(rates.getHUF() / rates.getCAD());
        rates.setIDR(rates.getIDR() / rates.getCAD());
        rates.setILS(rates.getILS() / rates.getCAD());
        rates.setINR(rates.getINR() / rates.getCAD());
        rates.setISK(rates.getISK() / rates.getCAD());
        rates.setJPY(rates.getJPY() / rates.getCAD());
        rates.setKRW(rates.getKRW() / rates.getCAD());
        rates.setMXN(rates.getMXN() / rates.getCAD());
        rates.setMYR(rates.getMYR() / rates.getCAD());
        rates.setNOK(rates.getNOK() / rates.getCAD());
        rates.setNZD(rates.getNZD() / rates.getCAD());
        rates.setPHP(rates.getPHP() / rates.getCAD());
        rates.setPLN(rates.getPLN() / rates.getCAD());
        rates.setRON(rates.getRON() / rates.getCAD());
        rates.setRUB(rates.getRUB() / rates.getCAD());
        rates.setSEK(rates.getSEK() / rates.getCAD());
        rates.setSGD(rates.getSGD() / rates.getCAD());
        rates.setTHB(rates.getTHB() / rates.getCAD());
        rates.setTRY(rates.getTRY() / rates.getCAD());
        rates.setUSD(rates.getUSD() / rates.getCAD());
        rates.setZAR(rates.getZAR() / rates.getCAD());
        rates.setCAD(1);
        return rates;
    }


}
