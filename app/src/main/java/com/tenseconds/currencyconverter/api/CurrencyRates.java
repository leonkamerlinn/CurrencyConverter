package com.tenseconds.currencyconverter.api;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(
        tableName = "currency_table"
)
public class CurrencyRates implements Parcelable {
    public CurrencyRates() {

    }
    @PrimaryKey(autoGenerate = true)
    private long ID = 1;

    @NonNull
    public float EUR = 1;
    @NonNull
    public float AUD;
    @NonNull
    public float BGN;
    @NonNull
    public float BRL;
    @NonNull
    public float CAD;
    @NonNull
    public float CHF;
    @NonNull
    public float CNY;
    @NonNull
    public float CZK;
    @NonNull
    public float DKK;
    @NonNull
    public float GBP;
    @NonNull
    public float HKD;
    @NonNull
    public float HRK;
    @NonNull
    public float HUF;
    @NonNull
    public float IDR;
    @NonNull
    public float ILS;
    @NonNull
    public float INR;
    @NonNull
    public float ISK;
    @NonNull
    public float JPY;
    @NonNull
    public float KRW;
    @NonNull
    public float MXN;
    @NonNull
    public float MYR;
    @NonNull
    public float NOK;
    @NonNull
    public float NZD;
    @NonNull
    public float PHP;
    @NonNull
    public float PLN;
    @NonNull
    public float RON;
    @NonNull
    public float RUB;
    @NonNull
    public float SEK;
    @NonNull
    public float SGD;
    @NonNull
    public float THB;
    @NonNull
    public float TRY;
    @NonNull
    public float USD;
    @NonNull
    public float ZAR;


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

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

    protected CurrencyRates(Parcel in) {
        ID = in.readLong();
        EUR = in.readFloat();
        AUD = in.readFloat();
        BGN = in.readFloat();
        BRL = in.readFloat();
        CAD = in.readFloat();
        CHF = in.readFloat();
        CNY = in.readFloat();
        CZK = in.readFloat();
        DKK = in.readFloat();
        GBP = in.readFloat();
        HKD = in.readFloat();
        HRK = in.readFloat();
        HUF = in.readFloat();
        IDR = in.readFloat();
        ILS = in.readFloat();
        INR = in.readFloat();
        ISK = in.readFloat();
        JPY = in.readFloat();
        KRW = in.readFloat();
        MXN = in.readFloat();
        MYR = in.readFloat();
        NOK = in.readFloat();
        NZD = in.readFloat();
        PHP = in.readFloat();
        PLN = in.readFloat();
        RON = in.readFloat();
        RUB = in.readFloat();
        SEK = in.readFloat();
        SGD = in.readFloat();
        THB = in.readFloat();
        TRY = in.readFloat();
        USD = in.readFloat();
        ZAR = in.readFloat();
    }

    public static final Creator<CurrencyRates> CREATOR = new Creator<CurrencyRates>() {
        @Override
        public CurrencyRates createFromParcel(Parcel in) {
            return new CurrencyRates(in);
        }

        @Override
        public CurrencyRates[] newArray(int size) {
            return new CurrencyRates[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(ID);
        parcel.writeFloat(EUR);
        parcel.writeFloat(AUD);
        parcel.writeFloat(BGN);
        parcel.writeFloat(BRL);
        parcel.writeFloat(CAD);
        parcel.writeFloat(CHF);
        parcel.writeFloat(CNY);
        parcel.writeFloat(CZK);
        parcel.writeFloat(DKK);
        parcel.writeFloat(GBP);
        parcel.writeFloat(HKD);
        parcel.writeFloat(HRK);
        parcel.writeFloat(HUF);
        parcel.writeFloat(IDR);
        parcel.writeFloat(ILS);
        parcel.writeFloat(INR);
        parcel.writeFloat(ISK);
        parcel.writeFloat(JPY);
        parcel.writeFloat(KRW);
        parcel.writeFloat(MXN);
        parcel.writeFloat(MYR);
        parcel.writeFloat(NOK);
        parcel.writeFloat(NZD);
        parcel.writeFloat(PHP);
        parcel.writeFloat(PLN);
        parcel.writeFloat(RON);
        parcel.writeFloat(RUB);
        parcel.writeFloat(SEK);
        parcel.writeFloat(SGD);
        parcel.writeFloat(THB);
        parcel.writeFloat(TRY);
        parcel.writeFloat(USD);
        parcel.writeFloat(ZAR);
    }



}