package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class PHP extends Currency {
    public PHP(DataSource data, float amount) {
        super(data, amount);
    }

    @Override
    public float getRate() {
        return rates.getPHP();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_philippines;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.PHP;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.php;
    }



    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getPHP());
        rates.setBGN(rates.getBGN() / rates.getPHP());
        rates.setEUR(rates.getEUR() / rates.getPHP());
        rates.setBRL(rates.getBRL() / rates.getPHP());
        rates.setCAD(rates.getCAD() / rates.getPHP());
        rates.setCHF(rates.getCHF() / rates.getPHP());
        rates.setCNY(rates.getCNY() / rates.getPHP());
        rates.setCZK(rates.getCZK() / rates.getPHP());
        rates.setDKK(rates.getDKK() / rates.getPHP());
        rates.setGBP(rates.getGBP() / rates.getPHP());
        rates.setHKD(rates.getHKD() / rates.getPHP());
        rates.setHRK(rates.getHRK() / rates.getPHP());
        rates.setHUF(rates.getHUF() / rates.getPHP());
        rates.setIDR(rates.getIDR() / rates.getPHP());
        rates.setILS(rates.getILS() / rates.getPHP());
        rates.setINR(rates.getINR() / rates.getPHP());
        rates.setISK(rates.getISK() / rates.getPHP());
        rates.setJPY(rates.getJPY() / rates.getPHP());
        rates.setKRW(rates.getKRW() / rates.getPHP());
        rates.setMXN(rates.getMXN() / rates.getPHP());
        rates.setMYR(rates.getMYR() / rates.getPHP());
        rates.setNOK(rates.getNOK() / rates.getPHP());
        rates.setNZD(rates.getNZD() / rates.getPHP());
        rates.setPLN(rates.getPLN() / rates.getPHP());
        rates.setRON(rates.getRON() / rates.getPHP());
        rates.setRUB(rates.getRUB() / rates.getPHP());
        rates.setSEK(rates.getSEK() / rates.getPHP());
        rates.setSGD(rates.getSGD() / rates.getPHP());
        rates.setTHB(rates.getTHB() / rates.getPHP());
        rates.setTRY(rates.getTRY() / rates.getPHP());
        rates.setUSD(rates.getUSD() / rates.getPHP());
        rates.setZAR(rates.getZAR() / rates.getPHP());
        rates.setPHP(1);
        return rates;
    }


}
