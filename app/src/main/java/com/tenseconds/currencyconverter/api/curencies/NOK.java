package com.tenseconds.currencyconverter.api.curencies;

import com.tenseconds.currencyconverter.R;
import com.tenseconds.currencyconverter.api.Currency;
import com.tenseconds.currencyconverter.api.CurrencyRates;
import com.tenseconds.currencyconverter.api.DataSource;

public class NOK extends Currency {

    public NOK(DataSource data, float amount) {
        super(data, amount);
    }


    @Override
    public float getRate() {
        return rates.getNOK();
    }

    @Override
    public int getFlagRes() {
        return R.drawable.ic_norway;
    }

    @Override
    public String getCurrencyCode() {
        return Currency.NOK;
    }

    @Override
    public int getCurrencyNameRes() {
        return R.string.nok;
    }

    @Override
    public CurrencyRates getRates() {
        rates.setAUD(rates.getAUD() / rates.getNOK());
        rates.setBGN(rates.getBGN() / rates.getNOK());
        rates.setEUR(rates.getEUR() / rates.getNOK());
        rates.setBRL(rates.getBRL() / rates.getNOK());
        rates.setCAD(rates.getCAD() / rates.getNOK());
        rates.setCHF(rates.getCHF() / rates.getNOK());
        rates.setCNY(rates.getCNY() / rates.getNOK());
        rates.setCZK(rates.getCZK() / rates.getNOK());
        rates.setDKK(rates.getDKK() / rates.getNOK());
        rates.setGBP(rates.getGBP() / rates.getNOK());
        rates.setHKD(rates.getHKD() / rates.getNOK());
        rates.setHRK(rates.getHRK() / rates.getNOK());
        rates.setHUF(rates.getHUF() / rates.getNOK());
        rates.setIDR(rates.getIDR() / rates.getNOK());
        rates.setILS(rates.getILS() / rates.getNOK());
        rates.setINR(rates.getINR() / rates.getNOK());
        rates.setISK(rates.getISK() / rates.getNOK());
        rates.setJPY(rates.getJPY() / rates.getNOK());
        rates.setKRW(rates.getKRW() / rates.getNOK());
        rates.setMXN(rates.getMXN() / rates.getNOK());
        rates.setMYR(rates.getMYR() / rates.getNOK());
        rates.setNZD(rates.getNZD() / rates.getNOK());
        rates.setPHP(rates.getPHP() / rates.getNOK());
        rates.setPLN(rates.getPLN() / rates.getNOK());
        rates.setRON(rates.getRON() / rates.getNOK());
        rates.setRUB(rates.getRUB() / rates.getNOK());
        rates.setSEK(rates.getSEK() / rates.getNOK());
        rates.setSGD(rates.getSGD() / rates.getNOK());
        rates.setTHB(rates.getTHB() / rates.getNOK());
        rates.setTRY(rates.getTRY() / rates.getNOK());
        rates.setUSD(rates.getUSD() / rates.getNOK());
        rates.setZAR(rates.getZAR() / rates.getNOK());
        rates.setNOK(1);
        return rates;
    }

}
