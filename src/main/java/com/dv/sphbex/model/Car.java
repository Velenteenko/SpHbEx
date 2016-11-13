package com.dv.sphbex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carId;
  @Column
	private String mark;
  @Column
	private String model;
  @Column
  private String producer;
  @Column
	private int rating;
	
  public Car() {
  }

  public Car(int carId, String mark, String model, String producer, int rating) {
		this.carId = carId;
		this.mark = mark;
		this.model = model;
    this.producer = producer;
		this.rating = rating;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

  public String getProducer() {
    return producer;
	}

  public void setProducer(String producer) {
    this.producer = producer;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
