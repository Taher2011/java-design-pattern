package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_02Car.Car;
import com.creational.abstractfactory_02Car.DMWCar;
import com.creational.abstractfactory_02Car.LemozeneCar;
import com.creational.abstractfactory_02Car.MercedesCar;
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
