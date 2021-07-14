package com.example.demo.service;

import com.example.demo.dao.CarDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Car;
import com.example.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserService {

  @Autowired
  UserDao userDao;
  @Autowired
  CarDao carDao;

  public Iterable<User> getAllUsers() {
    return userDao.findAll();
  }

  @Transactional
  public int insertUser(User user) {
    Car car = carDao.save(Car.builder().brand("TOYOTA").name("RAV4").build());
    log.info("{}", car);
    User result = userDao.save(user);
    log.info("{}", result);
//    Integer.parseInt("");
    return 0;
  }

}
