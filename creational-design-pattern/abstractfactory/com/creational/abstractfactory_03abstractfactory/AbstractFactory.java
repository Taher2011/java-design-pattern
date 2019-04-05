package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_01bike.Bike;
import com.creational.abstractfactory_02car.Car;
import com.creational.abstractfactory_05enum.VehicleType;

public abstract class AbstractFactory {

	public abstract Car createCar(VehicleType vehicleType);

	public abstract Bike createBike(VehicleType vehicleType);

}
