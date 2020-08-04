package com.iotat.ml.demo.controller;

import com.iotat.ml.demo.entity.City;
import com.iotat.ml.demo.servecs.lmp.UserImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    UserImp userImp;
    /**
     * 用户进入时候的地理位置
     * @param cityName
     */
    @RequestMapping("/userCityName")
    @ResponseBody
    public String userInto(String cityName) throws IOException {
        return userImp.userLocation(cityName);
    }
}
