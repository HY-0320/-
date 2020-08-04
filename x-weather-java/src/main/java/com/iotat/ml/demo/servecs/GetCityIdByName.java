package com.iotat.ml.demo.servecs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.iotat.ml.demo.dao.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

@Service
public class GetCityIdByName {

    @Autowired
    CityRepository cityRepository;

    /**
     * 通过城市的名字获得城市的id
     * @param Name 城市名称
     * @return data 城市id
     * @throws IOException
     */
    public String city(String Name) throws IOException {

        //连接网站接口
        URL serverUrl = new URL("https://geoapi.heweather.net/v2/city/lookup?location="+Name+"&key=1039bb39c7264698b2fb6234f8fc4e74");
        HttpURLConnection conn = (HttpURLConnection) serverUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json;charset=utf-8");
        conn.setInstanceFollowRedirects(false);
        conn.connect();
        //接收json字符串
        String CityStr;
        //接收返回的json字符页
        StringBuffer buffer = new StringBuffer();
        try (GZIPInputStream inputStream = new GZIPInputStream(conn.getInputStream());
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {
            //中间变量，读取字符流
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            //接收结果
            CityStr = buffer.toString();
        }

        JSONObject jsonObject1 = JSON.parseObject(CityStr);
        String localStr = jsonObject1.getString("location");
        String str3 = localStr.substring(1,localStr.length()-1);
        String[] arry = str3.split("},");
        for (int i = 0; i <arry.length ; i++) {
            if (arry[i].charAt(arry[i].length()-1) != '}') {
                arry[i] = arry[i] + "}";
            }
        }
        String data=null;
        for (int i = 0; i < arry.length; i++) {
            JSONObject jsonObject = JSON.parseObject(arry[i]);
            if(jsonObject.getString("name").equals(Name)){
                data = jsonObject.getString("id");
                break;
            }
        }
        return data;
    }
}


