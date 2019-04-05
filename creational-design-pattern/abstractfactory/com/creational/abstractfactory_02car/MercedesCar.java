package com.creational.abstractfactory_02car;

import com.creational.abstractfactory_05enum.VehicleType;

public class MercedesCar extends Car {

	public MercedesCar(VehicleType carType) {
		super();
		this.carType = carType;
		this.color = "Black";
		this.model = "Sedan";
	}

	@Override
	public void specification() {
		System.out.println("Specification of " + carType + " are Color is " + color + " and model is " + model);
	}

}