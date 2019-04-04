package com.creational.abstractfactory_02Car;

import com.creational.abstractfactory_05enum.VehicleType;

public abstract class Car {

	public String color;
	public String model;
	public VehicleType carType;

	public abstract void specification();
}
