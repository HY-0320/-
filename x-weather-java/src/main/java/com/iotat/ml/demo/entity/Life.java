package com.iotat.ml.demo.entity;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "Life")
public class Life {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "life_date")
    private Date LifeDate;
    @Column(name = "city_id")
    private String CityId;
    @Column(name = "daily_name")
    private String DailyName;
    @Column(name = "daily_category")
    private String DailyCategory;
    @Column(name = "daily_text")
    private String DailyText;

    public int getId() {
        return id;
    }

    public Date getLifeDate() {
        return LifeDate;
    }
    public String getCityId() {
        return CityId;
    }

    public String getDailyName() {
        return DailyName;
    }

    public String getDailyCategory() {
        return DailyCategory;
    }

    public String getDailyText() {
        return DailyText;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setLifeDate(Date lifeDate) {
        LifeDate = lifeDate;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public void setDailyName(String dailyName) {
        DailyName = dailyName;
    }

    public void setDailyCategory(String dailyCategory) {
        DailyCategory = dailyCategory;
    }

    public void setDailyText(String dailyText) {
        DailyText = dailyText;
    }
}
