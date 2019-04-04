package com.creational.abstractfactory_01Bike;

import com.creational.abstractfactory_05enum.VehicleType;

public class CBZBike extends Bike {

	public CBZBike(VehicleType bikeType) {
		super();
		this.bikeType = bikeType;
		this.color = "Silver";
		this.model = "2014";
	}

	@Override
	public void specification() {
		System.out.println("Specification of " + bikeType + " are Color is "
				+ color + " and model is " + model);
	}

}
