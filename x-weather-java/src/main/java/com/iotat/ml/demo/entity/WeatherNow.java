package com.iotat.ml.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather_now")
public class WeatherNow {


    @Id
    @GeneratedValue
    private int id;
    @Column(name = "city_id")
    private String CityId;
    @Column(name = "now_icon")
    private String NowIcon;
    @Column(name = "now_fx_time")
    private String NowFxTime;
    @Column(name = "now_temp")
    private String NowTemp;
    @Column(name = "now_text")
    private String NowText;
    @Column(name = "now_wind_dir")
    private String NowWindDir;

    public int getId() {
        return id;
    }


    public String getCityId() {
        return CityId;
    }

    public String getNowIcon() {
        return NowIcon;
    }

    public String getNowFxTime() {
        return NowFxTime;
    }

    public String getNowTemp() {
        return NowTemp;
    }

    public String getNowText() {
        return NowText;
    }

    public String getNowWindDir() {
        return NowWindDir;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public void setNowIcon(String nowIcon) {
        NowIcon = nowIcon;
    }

    public void setNowFxTime(String nowFxTime) {
        NowFxTime = nowFxTime;
    }

    public void setNowTemp(String nowTemp) {
        NowTemp = nowTemp;
    }

    public void setNowText(String nowText) {
        NowText = nowText;
    }

    public void setNowWindDir(String nowWindDir) {
        NowWindDir = nowWindDir;
    }
}