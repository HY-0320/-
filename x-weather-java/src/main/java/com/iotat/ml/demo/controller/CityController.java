package com.iotat.ml.demo.controller;

import com.iotat.ml.demo.dao.CityRepository;
import com.iotat.ml.demo.entity.City;
import com.iotat.ml.demo.servecs.GetCityIdByName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    GetCityIdByName getCityIdByName;

    @Autowired
    CityRepository cityRepository;

    /**
     * 通过城市的名称将获得城市id，并将其保存下来
     * @param cityName 城市名称
     * @throws IOException
     */
    @RequestMapping("/cityName")
    @ResponseBody
    public void citySet(String cityName) throws IOException {
        String id = null;
        id=getCityIdByName.city(cityName);
        City city=new City();
        city.setCityId(id);
        city.setCityName(cityName);
        city.setDate(new Date());//存入城市id的时间
        cityRepository.save(city);
    }
}
