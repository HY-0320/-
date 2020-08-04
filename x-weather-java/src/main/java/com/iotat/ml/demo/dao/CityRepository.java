package com.iotat.ml.demo.dao;

import com.iotat.ml.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

    City findCityByCityName(String CityName);

}
