package com.dv.sphbex.dao;

import java.util.List;

import com.dv.sphbex.model.Car;

public interface CarDao {

  public void add (Car car);

  public boolean edit (Car car);

  public boolean delete(int carId);

  public Car getCarById(int carId);

  public List getAllCars();
  
}
