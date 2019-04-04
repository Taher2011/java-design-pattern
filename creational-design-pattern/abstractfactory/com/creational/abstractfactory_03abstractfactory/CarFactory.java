package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_02car.Car;
import com.creational.abstractfactory_02car.DMWCar;
import com.creational.abstractfactory_02car.LemozeneCar;
import com.creational.abstractfactory_02car.MercedesCar;
import com.creational.abstractfactory_05enum.VehicleType;

public class CarFactory extends AbstractFactory<Car> {

	@Override
	public Car create(VehicleType type) {

		if (type.equals(VehicleType.DMW)) {
			return new DMWCar(type);
		} else if (type.equals(VehicleType.LEMOZENE)) {
			return new LemozeneCar(type);
		} else if (type.equals(VehicleType.MERCEDES)) {
			return new MercedesCar(type);
		}

		return null;
	}

}
