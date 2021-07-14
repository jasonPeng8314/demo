package com.example.demo.dao;

import com.example.demo.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarDao extends CrudRepository<Car, Integer> {

}
