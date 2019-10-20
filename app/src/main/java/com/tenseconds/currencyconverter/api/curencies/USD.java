package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class USD extends Currency {

    public USD(DataSource data, float amount) {
        super(data, amount);
    }



    @Override
    public float getRate() {
        return rates.getUSD();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_united_states_of_america;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.USD;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.usd;
    }


    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getUSD());
        rates.setBGN(rates.getBGN() / rates.getUSD());
        rates.setEUR(rates.getEUR() / rates.getUSD());
        rates.setBRL(rates.getBRL() / rates.getUSD());
        rates.setCAD(rates.getCAD() / rates.getUSD());
        rates.setCHF(rates.getCHF() / rates.getUSD());
        rates.setCNY(rates.getCNY() / rates.getUSD());
        rates.setCZK(rates.getCZK() / rates.getUSD());
        rates.setDKK(rates.getDKK() / rates.getUSD());
        rates.setGBP(rates.getGBP() / rates.getUSD());
        rates.setHKD(rates.getHKD() / rates.getUSD());
        rates.setHRK(rates.getHRK() / rates.getUSD());
        rates.setHUF(rates.getHUF() / rates.getUSD());
        rates.setIDR(rates.getIDR() / rates.getUSD());
        rates.setILS(rates.getILS() / rates.getUSD());
        rates.setINR(rates.getINR() / rates.getUSD());
        rates.setISK(rates.getISK() / rates.getUSD());
        rates.setJPY(rates.getJPY() / rates.getUSD());
        rates.setKRW(rates.getKRW() / rates.getUSD());
        rates.setMXN(rates.getMXN() / rates.getUSD());
        rates.setMYR(rates.getMYR() / rates.getUSD());
        rates.setNOK(rates.getNOK() / rates.getUSD());
        rates.setNZD(rates.getNZD() / rates.getUSD());
        rates.setPHP(rates.getPHP() / rates.getUSD());
        rates.setPLN(rates.getPLN() / rates.getUSD());
        rates.setRON(rates.getRON() / rates.getUSD());
        rates.setRUB(rates.getRUB() / rates.getUSD());
        rates.setSEK(rates.getSEK() / rates.getUSD());
        rates.setSGD(rates.getSGD() / rates.getUSD());
        rates.setTHB(rates.getTHB() / rates.getUSD());
        rates.setTRY(rates.getTRY() / rates.getUSD());
        rates.setZAR(rates.getZAR() / rates.getUSD());
        rates.setUSD(1);
        return rates;
    }

}
