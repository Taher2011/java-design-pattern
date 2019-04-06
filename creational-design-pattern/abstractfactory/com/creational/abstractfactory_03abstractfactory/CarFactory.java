package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_01bikeentity.Bike;
import com.creational.abstractfactory_02carentity.Car;
import com.creational.abstractfactory_02carentity.DMWCar;
import com.creational.abstractfactory_02carentity.LemozeneCar;
import com.creational.abstractfactory_02carentity.MercedesCar;
import com.creational.abstractfactory_05enum.VehicleType;

public class CarFactory extends AbstractFactory {

	@Override
	public Car createCar(VehicleType type) {

		if (type.equals(VehicleType.DMW)) {
			return new DMWCar(type);
		} else if (type.equals(VehicleType.LEMOZENE)) {
			return new LemozeneCar(type);
		} else if (type.equals(VehicleType.MERCEDES)) {
			return new MercedesCar(type);
		}

		return null;
	}

	@Override
	public Bike createBike(VehicleType vehicleType) {
		return null;
	}

}
