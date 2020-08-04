package com.iotat.ml.demo.servecs.lmp;

import com.iotat.ml.demo.dao.CityRepository;
import com.iotat.ml.demo.entity.City;
import com.iotat.ml.demo.servecs.GetCityIdByName;
import com.iotat.ml.demo.servecs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class UserImp implements User {
    @Autowired
    CityRepository cityRepository;

    @Autowired
    GetCityIdByName getCityIdByName;

    @Override
    public String userLocation(String locationName) throws IOException {
        String city=null;
        City cityStart=new City();
        cityStart=cityRepository.findCityByCityName(locationName);//数据库里面的city数据
        String id = null;//获得城市的id值
        Date date=new Date();//当前的时间
        //判断今天内有没有进行数据查询
        if (cityStart.getDate() != date) {
            id = getCityIdByName.city(locationName);
            cityStart.setCityId(id);
            cityStart.setCityName(locationName);
            cityStart.setDate(new Date());//存入城市id的时间
            cityRepository.save(cityStart);
        }
        city = cityStart.toString();

        return city;
    }
}
