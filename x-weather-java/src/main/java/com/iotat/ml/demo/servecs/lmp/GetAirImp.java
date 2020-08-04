package com.iotat.ml.demo.servecs.lmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.iotat.ml.demo.dao.AirRepository;
import com.iotat.ml.demo.entity.Air;
import com.iotat.ml.demo.util.GetJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;

@Service
@Resource
public class GetAirImp {


    @Autowired
    AirRepository airRepository;
    public void getAir(String ulr,String cityId) throws IOException {

        GetJson getJson=new GetJson();
        Air air=new Air();
        String AirStr=getJson.getJson(ulr,cityId);
        JSONObject jsonObject = JSON.parseObject(AirStr);
        JSONObject Now=jsonObject.getJSONObject("now");
        air.setCityId(cityId);
        air.setAirDate(new Date());
        air.setAirAqi(Now.getString("aqi"));
        air.setAirCategory(Now.getString("category"));
        air.setAirPm2p5(Now.getString("pm2p5"));
        air.setAirNo2(Now.getString("no2"));
        air.setAirSo2(Now.getString("so2"));
        air.setAirCo(Now.getString("co"));
        air.setAirO3(Now.getString("o3"));
        airRepository.save(air);
    }
}
