package com.chuangweather.android.db;

import java.util.Date;

/**
 * Created by 10840 on 17/05/29.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public Void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

