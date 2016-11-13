package com.dv.sphbex.service;

import java.util.List;

import com.dv.sphbex.model.Car;

public interface CarService {

  public void add(Car car);

  public boolean edit(Car car);

  public boolean delete(int carId);

  public Car getCarById(int carId);

  public List getAllCars();
}
