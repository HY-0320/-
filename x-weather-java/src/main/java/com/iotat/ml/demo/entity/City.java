package com.iotat.ml.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "City")
public class City {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "city_date")
    private Date date;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "city_id")
    private String cityId;



    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }



}
