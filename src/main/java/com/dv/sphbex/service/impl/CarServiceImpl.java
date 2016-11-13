package com.dv.sphbex.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dv.sphbex.dao.CarDao;
import com.dv.sphbex.model.Car;
import com.dv.sphbex.service.CarService;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  private CarDao carDao;

  @Transactional
  public void add(Car car) {
    carDao.add(car);
  }

  @Transactional
  public boolean edit(Car car) {
    return carDao.edit(car);
  }

  @Transactional
  public boolean delete(int carId) {
    return carDao.delete(carId);
  }

  @Transactional
  public Car getCarById(int carId) {
    return carDao.getCarById(carId);
  }

  @Transactional
  public List getAllCars() {
    return carDao.getAllCars();
  }

}
