package com.iotat.ml.demo.controller;

import com.iotat.ml.demo.dao.LifeRepository;
import com.iotat.ml.demo.entity.City;
import com.iotat.ml.demo.servecs.lmp.GetLifeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/life")
public class LifeController {
    @Autowired
    LifeRepository lifeRepository;

    @Autowired
    GetLifeImp getLifeImp;

    /**
     * 获得不同的生活指数并存入数据库
     * @param cityId 城市id
     */
    @RequestMapping("/getLife")
    @ResponseBody
    public void LifeSet(String cityId) throws IOException {
        //穿衣指数
        getLifeImp.getType(cityId,"3");
        //紫外线指数
        getLifeImp.getType(cityId,"5");
        //感冒指数
        getLifeImp.getType(cityId,"9");
        //化妆指数
        getLifeImp.getType(cityId,"13");
    }
}
