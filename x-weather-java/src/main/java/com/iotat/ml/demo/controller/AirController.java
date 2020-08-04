package com.iotat.ml.demo.controller;

import com.iotat.ml.demo.dao.AirRepository;
import com.iotat.ml.demo.servecs.lmp.GetAirImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;

@RestController
@RequestMapping("/air")
public class AirController {

    @Autowired
    AirRepository airRepository;

    @Autowired
    GetAirImp getAirImp;

    /**
     * 通过城市的id获得天气的空气质量，并将其保存下来
     * @throws IOException
     */
    @RequestMapping("/getAir")
    @ResponseBody
    public void AirSet(String id) throws IOException {
//        GetAirImp getAirImp=new GetAirImp();
        String url="https://devapi.heweather.net/v7/air/now?";

        getAirImp.getAir(url,id);
    }
}
