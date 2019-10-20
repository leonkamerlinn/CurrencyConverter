package com.tenseconds.currencyconverter.api;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;


public class CurrencyRates {
    public CurrencyRates() {

    }

    private float EUR = 1;
    private float AUD = 1;
    private float BGN = 1;
    private float BRL = 1;
    private float CAD = 1;
    private float CHF = 1;
    private float CNY = 1;
    private float CZK = 1;
    private float DKK = 1;
    private float GBP = 1;
    private float HKD = 1;
    private float HRK = 1;
    private float HUF = 1;
    private float IDR = 1;
    private float ILS = 1;
    private float INR = 1;
    private float ISK = 1;
    private float JPY = 1;
    private float KRW = 1;
    private float MXN = 1;
    private float MYR = 1;
    private float NOK = 1;
    private float NZD = 1;
    private float PHP = 1;
    private float PLN = 1;
    private float RON = 1;
    private float RUB = 1;
    private float SEK = 1;
    private float SGD = 1;
    private float THB = 1;
    private float TRY = 1;
    private float USD = 1;
    private float ZAR = 1;



    public float getEUR() {
        return EUR;
    }

    public void setEUR(float EUR) {
        this.EUR = EUR;
    }

    public float getAUD() {
        return AUD;
    }

    public void setAUD(float AUD) {
        this.AUD = AUD;
    }

    public float getBGN() {
        return BGN;
    }

    public void setBGN(float BGN) {
        this.BGN = BGN;
    }

    public float getBRL() {
        return BRL;
    }

    public void setBRL(float BRL) {
        this.BRL = BRL;
    }

    public float getCAD() {
        return CAD;
    }

    public void setCAD(float CAD) {
        this.CAD = CAD;
    }

    public float getCHF() {
        return CHF;
    }

    public void setCHF(float CHF) {
        this.CHF = CHF;
    }

    public float getCNY() {
        return CNY;
    }

    public void setCNY(float CNY) {
        this.CNY = CNY;
    }

    public float getCZK() {
        return CZK;
    }

    public void setCZK(float CZK) {
        this.CZK = CZK;
    }

    public float getDKK() {
        return DKK;
    }

    public void setDKK(float DKK) {
        this.DKK = DKK;
    }

    public float getGBP() {
        return GBP;
    }

    public void setGBP(float GBP) {
        this.GBP = GBP;
    }

    public float getHKD() {
        return HKD;
    }

    public void setHKD(float HKD) {
        this.HKD = HKD;
    }

    public float getHRK() {
        return HRK;
    }

    public void setHRK(float HRK) {
        this.HRK = HRK;
    }

    public float getHUF() {
        return HUF;
    }

    public void setHUF(float HUF) {
        this.HUF = HUF;
    }

    public float getIDR() {
        return IDR;
    }

    public void setIDR(float IDR) {
        this.IDR = IDR;
    }

    public float getILS() {
        return ILS;
    }

    public void setILS(float ILS) {
        this.ILS = ILS;
    }

    public float getINR() {
        return INR;
    }

    public void setINR(float INR) {
        this.INR = INR;
    }

    public float getISK() {
        return ISK;
    }

    public void setISK(float ISK) {
        this.ISK = ISK;
    }

    public float getJPY() {
        return JPY;
    }

    public void setJPY(float JPY) {
        this.JPY = JPY;
    }

    public float getKRW() {
        return KRW;
    }

    public void setKRW(float KRW) {
        this.KRW = KRW;
    }

    public float getMXN() {
        return MXN;
    }

    public void setMXN(float MXN) {
        this.MXN = MXN;
    }

    public float getMYR() {
        return MYR;
    }

    public void setMYR(float MYR) {
        this.MYR = MYR;
    }

    public float getNOK() {
        return NOK;
    }

    public void setNOK(float NOK) {
        this.NOK = NOK;
    }

    public float getNZD() {
        return NZD;
    }

    public void setNZD(float NZD) {
        this.NZD = NZD;
    }

    public float getPHP() {
        return PHP;
    }

    public void setPHP(float PHP) {
        this.PHP = PHP;
    }

    public float getPLN() {
        return PLN;
    }

    public void setPLN(float PLN) {
        this.PLN = PLN;
    }

    public float getRON() {
        return RON;
    }

    public void setRON(float RON) {
        this.RON = RON;
    }

    public float getRUB() {
        return RUB;
    }

    public void setRUB(float RUB) {
        this.RUB = RUB;
    }

    public float getSEK() {
        return SEK;
    }

    public void setSEK(float SEK) {
        this.SEK = SEK;
    }

    public float getSGD() {
        return SGD;
    }

    public void setSGD(float SGD) {
        this.SGD = SGD;
    }

    public float getTHB() {
        return THB;
    }

    public void setTHB(float THB) {
        this.THB = THB;
    }

    public float getTRY() {
        return TRY;
    }

    public void setTRY(float TRY) {
        this.TRY = TRY;
    }

    public float getUSD() {
        return USD;
    }

    public void setUSD(float USD) {
        this.USD = USD;
    }

    public float getZAR() {
        return ZAR;
    }

    public void setZAR(float ZAR) {
        this.ZAR = ZAR;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyRates that = (CurrencyRates) o;
        return Float.compare(that.EUR, EUR) == 0 &&
                Float.compare(that.AUD, AUD) == 0 &&
                Float.compare(that.BGN, BGN) == 0 &&
                Float.compare(that.BRL, BRL) == 0 &&
                Float.compare(that.CAD, CAD) == 0 &&
                Float.compare(that.CHF, CHF) == 0 &&
                Float.compare(that.CNY, CNY) == 0 &&
                Float.compare(that.CZK, CZK) == 0 &&
                Float.compare(that.DKK, DKK) == 0 &&
                Float.compare(that.GBP, GBP) == 0 &&
                Float.compare(that.HKD, HKD) == 0 &&
                Float.compare(that.HRK, HRK) == 0 &&
                Float.compare(that.HUF, HUF) == 0 &&
                Float.compare(that.IDR, IDR) == 0 &&
                Float.compare(that.ILS, ILS) == 0 &&
                Float.compare(that.INR, INR) == 0 &&
                Float.compare(that.ISK, ISK) == 0 &&
                Float.compare(that.JPY, JPY) == 0 &&
                Float.compare(that.KRW, KRW) == 0 &&
                Float.compare(that.MXN, MXN) == 0 &&
                Float.compare(that.MYR, MYR) == 0 &&
                Float.compare(that.NOK, NOK) == 0 &&
                Float.compare(that.NZD, NZD) == 0 &&
                Float.compare(that.PHP, PHP) == 0 &&
                Float.compare(that.PLN, PLN) == 0 &&
                Float.compare(that.RON, RON) == 0 &&
                Float.compare(that.RUB, RUB) == 0 &&
                Float.compare(that.SEK, SEK) == 0 &&
                Float.compare(that.SGD, SGD) == 0 &&
                Float.compare(that.THB, THB) == 0 &&
                Float.compare(that.TRY, TRY) == 0 &&
                Float.compare(that.USD, USD) == 0 &&
                Float.compare(that.ZAR, ZAR) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(EUR, AUD, BGN, BRL, CAD, CHF, CNY, CZK, DKK, GBP, HKD, HRK, HUF, IDR, ILS, INR, ISK, JPY, KRW, MXN, MYR, NOK, NZD, PHP, PLN, RON, RUB, SEK, SGD, THB, TRY, USD, ZAR);
    }
}