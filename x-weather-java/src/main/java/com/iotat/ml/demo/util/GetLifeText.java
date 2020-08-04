package com.iotat.ml.demo.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class GetLifeText {

    /**
     * 获得生活指数的描述
     * @param id   城市id
     * @param type 生活指数类型
     * @return
     * @throws IOException
     */
    public String getType(String id,String type) throws IOException {
        URL serverUrl = new URL("https://devapi.heweather.net/v7/indices/1d?location="+id+"&key=1039bb39c7264698b2fb6234f8fc4e74&type="+type);
        HttpURLConnection conn = (HttpURLConnection) serverUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json;charset=utf-8");
        conn.setInstanceFollowRedirects(false);
        conn.connect();
        //接收json字符串
        String LifeJson=null;
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
            LifeJson = buffer.toString();
        }
        return LifeJson;
    }
}
