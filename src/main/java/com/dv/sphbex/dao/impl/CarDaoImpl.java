package com.dv.sphbex.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dv.sphbex.dao.CarDao;
import com.dv.sphbex.model.Car;

@Repository
public class CarDaoImpl implements CarDao {

  // public static Logger logger = LoggerFactory.getLogger(CarDaoImpl.class);

  @Autowired
  private SessionFactory session;

  @Override
  public void add(Car car) {
    // logger.info("Start to add car.");
    if (car != null) {
      session.getCurrentSession().save(car);
    }
    // logger.info("Car was added!");
  }

  @Override
  public boolean edit(Car car) {
    if (car != null) {
      session.getCurrentSession().update(car);
    } else {
      // logger.error("Car was not updated!");
      return false;
    }
    // logger.info("Car was updated!");
    return true;
  }

  @Override
  public boolean delete(int carId) {
    if (carId != 0) {
      session.getCurrentSession().delete(getCarById(carId));
    } else {
      // logger.error("Car was not deleted by ID: "+carId);
      return false;
    }
    // logger.info("Car was deleted by ID: " + carId);
    return true;
  }

  @Override
  public Car getCarById(int carId) {
    // logger.info("Getting car by ID: " + carId);
    return (Car) session.getCurrentSession().get(Car.class, carId);
  }

  @Override
  public List getAllCars() {
    // logger.info("Receive car objects.");
    return session.getCurrentSession().createQuery("from Car").list();
  }

}
