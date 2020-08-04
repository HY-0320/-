package com.iotat.ml.demo.servecs.lmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.iotat.ml.demo.dao.WeatherNowRepository;
import com.iotat.ml.demo.dao.WeatherSevenRepository;
import com.iotat.ml.demo.entity.WeatherNow;
import com.iotat.ml.demo.entity.WeatherSeven;
import com.iotat.ml.demo.servecs.GetWeather;
import com.iotat.ml.demo.util.GetJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
@Resource
public class GetWeatherImp implements GetWeather {

    @Autowired
    WeatherNowRepository weatherNowRepository;

    @Autowired
    WeatherSevenRepository weatherSevenRepository;

    /**
     * 获得未来7天的天气
     * @param cityId
     * @throws IOException
     */
    @Override
    public void getSevenDay(String cityId) throws IOException {
        GetJson getJson=new GetJson();
        String url="https://devapi.heweather.net/v7/weather/7d?";
        String SevenDay=getJson.getJson(url,cityId);
        JSONObject jsonObject = JSON.parseObject(SevenDay);
        JSONArray daily = jsonObject.getJSONArray("daily");

        for(int i=0;i<daily.size();i++){
            WeatherSeven weatherSeven=new WeatherSeven();
            weatherSeven.setCityId(cityId);
            JSONObject date=daily.getJSONObject(i);
            weatherSeven.setSevenFxDate(date.getString("fxDate"));
            weatherSeven.setSevenSunrise(date.getString("sunrise"));
            weatherSeven.setSevenSunset(date.getString("sunset"));
            weatherSeven.setSevenTempMax(date.getString("tempMax"));
            weatherSeven.setSevenTempMin(date.getString("tempMin"));
            weatherSeven.setSevenIconDay(date.getString("iconDay"));
            weatherSeven.setSevenTextDay(date.getString("textDay"));
            weatherSeven.setSevenIconNight(date.getString("iconNight"));
            weatherSeven.setSevenTextNight(date.getString("textNight"));
            weatherSevenRepository.save(weatherSeven);
        }

    }

    /**
     * 获得未来24小时的天气
     * @param cityId
     * @throws IOException
     */
    @Override
    public void getOneDay(String cityId) throws IOException{
        GetJson getJson=new GetJson();



        String url="https://devapi.heweather.net/v7/weather/24h?";
        String oneDay=getJson.getJson(url,cityId);
        JSONObject jsonObject = JSON.parseObject(oneDay);
        JSONArray hourly = jsonObject.getJSONArray("hourly");
        for (int i=0;i<hourly.size();i++) {
            WeatherNow weatherNow=new WeatherNow();
            weatherNow.setCityId(cityId);
            JSONObject date=hourly.getJSONObject(i);
            weatherNow.setNowFxTime(date.getString("fxTime"));
            weatherNow.setNowTemp(date.getString("temp"));
            weatherNow.setNowIcon(date.getString("icon"));
            weatherNow.setNowText(date.getString("text"));
            weatherNow.setNowWindDir(date.getString("windDir"));
            weatherNowRepository.save(weatherNow);
        }

    }
}
