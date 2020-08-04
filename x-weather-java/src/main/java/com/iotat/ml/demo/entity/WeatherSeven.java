package com.iotat.ml.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Weather_seven")
public class WeatherSeven {


    @Id
    @GeneratedValue
    private int id;
    @Column(name = "city_id")
    private String CityId;
    @Column(name = "seven_fxdate")
    private String SevenFxDate;
    @Column(name = "seven_sunrise")
    private String SevenSunrise;
    @Column(name = "seven_sunset")
    private String SevenSunset;
    @Column(name = "seven_tempmax")
    private String SevenTempMax;
    @Column(name = "seven_tempmin")
    private String SevenTempMin;
    @Column(name = "seven_icon_day")
    private String SevenIconDay;
    @Column(name = "seven_text_day")
    private String SevenTextDay;
    @Column(name = "seven_icon_night")
    private String SevenIconNight;
    @Column(name = "seven_text_night")
    private String SevenTextNight;


    public int getId() {
        return id;
    }

    public String getCityId() {
        return CityId;
    }

    public String getSevenFxDate() {
        return SevenFxDate;
    }

    public String getSevenSunrise() {
        return SevenSunrise;
    }

    public String getSevenSunset() {
        return SevenSunset;
    }

    public String getSevenTempMax() {
        return SevenTempMax;
    }

    public String getSevenTempMin() {
        return SevenTempMin;
    }

    public String getSevenIconDay() {
        return SevenIconDay;
    }

    public String getSevenTextDay() {
        return SevenTextDay;
    }

    public String getSevenIconNight() {
        return SevenIconNight;
    }

    public String getSevenTextNight() {
        return SevenTextNight;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public void setSevenFxDate(String sevenFxDate) {
        SevenFxDate = sevenFxDate;
    }

    public void setSevenSunrise(String sevenSunrise) {
        SevenSunrise = sevenSunrise;
    }

    public void setSevenSunset(String sevenSunset) {
        SevenSunset = sevenSunset;
    }

    public void setSevenTempMax(String sevenTempMax) {
        SevenTempMax = sevenTempMax;
    }

    public void setSevenTempMin(String sevenTempMin) {
        SevenTempMin = sevenTempMin;
    }

    public void setSevenIconDay(String sevenIconDay) {
        SevenIconDay = sevenIconDay;
    }

    public void setSevenTextDay(String sevenTextDay) {
        SevenTextDay = sevenTextDay;
    }

    public void setSevenIconNight(String sevenIconNight) {
        SevenIconNight = sevenIconNight;
    }

    public void setSevenTextNight(String sevenTextNight) {
        SevenTextNight = sevenTextNight;
    }
}
