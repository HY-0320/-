package com.iotat.ml.demo.servecs;

import java.io.IOException;

public interface GetWeather {
    /**
     * 获得未来7天的天气数据
     * @param id
     * @throws IOException
     */
    public void getSevenDay(String id) throws IOException;
    public void getOneDay(String id) throws IOException;
}
