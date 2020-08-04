package com.iotat.ml.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Air")
public class Air {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "city_id")
    private String CityId;
    @Column(name = "air_date")
    private Date AirDate;
    @Column(name = "air_aqi")
    private String AirAqi;
    @Column(name = "air_category")
    private String AirCategory;
    @Column(name = "air_pm2p5")
    private String AirPm2p5;
    @Column(name = "air_no2")
    private String AirNo2;
    @Column(name = "air_so2")
    private String AirSo2;
    @Column(name = "air_co")
    private String AirCo;
    @Column(name = "air_o3")
    private String AirO3;


    //get
    public int getId() {
        return id;
    }

    public String getCityId() {
        return CityId;
    }

    public String getAirAqi() {
        return AirAqi;
    }

    public String getAirCategory() {
        return AirCategory;
    }

    public String getAirPm2p5() {
        return AirPm2p5;
    }

    public String getAirNo2() {
        return AirNo2;
    }

    public String getAirSo2() {
        return AirSo2;
    }

    public String getAirCo() {
        return AirCo;
    }

    public String getAirO3() {
        return AirO3;
    }

    public Date getAirDate() {
        return AirDate;
    }

    //set
    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public void setAirAqi(String airAqi) {
        AirAqi = airAqi;
    }

    public void setAirCategory(String airCategory) {
        AirCategory = airCategory;
    }

    public void setAirPm2p5(String airPm2p5) {
        AirPm2p5 = airPm2p5;
    }

    public void setAirNo2(String airNo2) {
        AirNo2 = airNo2;
    }

    public void setAirSo2(String airSo2) {
        AirSo2 = airSo2;
    }

    public void setAirCo(String airCo) {
        AirCo = airCo;
    }

    public void setAirO3(String airO3) {
        AirO3 = airO3;
    }

    public void setAirDate(Date airDate) {
        AirDate = airDate;
    }
}
