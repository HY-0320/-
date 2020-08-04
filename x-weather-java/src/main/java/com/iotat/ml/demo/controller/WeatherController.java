package com.iotat.ml.demo.controller;



import com.iotat.ml.demo.servecs.lmp.GetWeatherImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    GetWeatherImp getWeatherImp;

    @RequestMapping("/weatherNow")
    @ResponseBody
    public void weatherNowSet(String cityId) throws IOException {
        getWeatherImp.getOneDay(cityId);
    }

    @RequestMapping("/weatherSeven")
    @ResponseBody
    public void weatherSevenSet(String cityId) throws IOException {
        getWeatherImp.getSevenDay(cityId);
    }


}