package com.springmvc.model;


public class Car {
	
	private int carId;
	private String manufacturer;
    private Integer model;
    private String city;
    private String registrationNumber;
    
    public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", manufacturer=" + manufacturer + ", model=" + model + "]";
	}
	
    
    
}
