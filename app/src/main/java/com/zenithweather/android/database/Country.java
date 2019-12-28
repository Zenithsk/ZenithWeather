package com.zenithweather.android.database;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;//记录县的名字
    private String weatherId; //记录县所对应的天气id
    private int cityId; //记录当前县所属的市的id

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId =  weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
