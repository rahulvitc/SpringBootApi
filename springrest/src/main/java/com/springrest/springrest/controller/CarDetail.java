package com.springrest.springrest.controller;

public class CarDetail {
	
	 private String carModel;
	 private String subModel;
	 
	 CarDetail(String model, String submodel){
		 this.carModel = model;
		 this.subModel = submodel;
	 }
	 
	public String getCarModel() {
		return carModel;
	}


	public String getSubModel() {
		return subModel;
	}



	@Override
	public String toString() {
		return "CarDetail [carModel=" + carModel + ", subModel=" + subModel + "]";
	}

}
