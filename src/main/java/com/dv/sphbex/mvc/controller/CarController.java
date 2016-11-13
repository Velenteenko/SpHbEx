package com.dv.sphbex.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dv.sphbex.model.Car;
import com.dv.sphbex.service.CarService;

@Controller
public class CarController {

  private static final String ACTION_ADD = "ADD";
  private static final String ACTION_EDIT = "EDIT";
  private static final String ACTION_DELETE = "DELETE";
  private static final String ACTION_SHOW = "SHOW";

  @Autowired
  private CarService carService;

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String setupForm(Map<String, Object> formMap) {

    Car car = new Car();

    formMap.put("car", car);
    formMap.put("carList", carService.getAllCars());

    return "car-form";
  }

  @RequestMapping(value = "/car-action.do", method = RequestMethod.POST)
  public String doActions(@ModelAttribute Car car, BindingResult result, @RequestParam String action,
      Map<String, Object> formMap) {

    Car carResult = new Car();

    if (action.toUpperCase().equals(ACTION_ADD)) {
      carService.add(car);
      carResult = car;
    } else if (action.toUpperCase().equals(ACTION_EDIT)) {
      carService.edit(car);
      carResult = car;
    } else if (action.toUpperCase().equals(ACTION_DELETE)) {
      carService.delete(car.getCarId());
      carResult = new Car();
    } else if (action.toUpperCase().equals(ACTION_SHOW)) {
      Car searchedCar = carService.getCarById(car.getCarId());
      carResult = searchedCar != null ? searchedCar : new Car();

    }
    formMap.put("car", carResult);
    formMap.put("carList", carService.getAllCars());
      return "car-form";
  }
}
