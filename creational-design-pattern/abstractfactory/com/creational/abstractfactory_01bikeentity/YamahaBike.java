package com.creational.abstractfactory_01bikeentity;

import com.creational.abstractfactory_05enum.VehicleType;

public class YamahaBike extends Bike {

	public YamahaBike(VehicleType bikeType) {
		super();
		this.bikeType = bikeType;
		this.color = color;
		this.model = model;
	}

	@Override
	public void specification() {
		System.out.println("Specification of " + bikeType + " are Color is " + color + " and model is " + model);
	}

}
