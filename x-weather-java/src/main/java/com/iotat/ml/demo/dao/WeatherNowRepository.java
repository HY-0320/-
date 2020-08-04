package com.iotat.ml.demo.dao;

import com.iotat.ml.demo.entity.WeatherNow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherNowRepository extends JpaRepository<WeatherNow, Integer> {



}
