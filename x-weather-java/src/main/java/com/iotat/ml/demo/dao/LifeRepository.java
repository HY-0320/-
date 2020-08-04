package com.iotat.ml.demo.dao;


import com.iotat.ml.demo.entity.Life;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LifeRepository extends JpaRepository<Life, Integer> {

}
