package com.creational.abstractfactory_01bikeentity;

import com.creational.abstractfactory_05enum.VehicleType;

public abstract class Bike {

	public String color;
	public String model;
	public VehicleType bikeType;

	public abstract void specification();
}
