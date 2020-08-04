package com.iotat.ml.demo.servecs.lmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.iotat.ml.demo.dao.LifeRepository;
import com.iotat.ml.demo.entity.Life;
import com.iotat.ml.demo.util.GetLifeText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;

@Service
@Resource
public class GetLifeImp {


    @Autowired
    LifeRepository lifeRepository;

    public void getType(String id,String type) throws IOException {
        GetLifeText getLifeText=new GetLifeText();
        Life life=new Life();

        //得到穿衣指数的json
        String Type=getLifeText.getType(id,type);
        JSONObject jsonObject = JSON.parseObject(Type);
        JSONArray daily1 = jsonObject.getJSONArray("daily");
        JSONObject daily=daily1.getJSONObject(0);
        life.setCityId(id);
        life.setLifeDate(new Date());
        life.setDailyName(daily.getString("name"));
        life.setDailyCategory(daily.getString("category"));
        life.setDailyText(daily.getString("text"));
        lifeRepository.save(life);
    }

}
