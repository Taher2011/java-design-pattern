package com.creational.abstractfactory_04factory;

import com.creational.abstractfactory_03abstractfactory.AbstractFactory;
import com.creational.abstractfactory_03abstractfactory.BikeFactory;
import com.creational.abstractfactory_03abstractfactory.CarFactory;
import com.creational.abstractfactory_05enum.VehicleType;

public class Factory {

	public static AbstractFactory createFactory(VehicleType type) {

		if (type.equals(VehicleType.CAR)) {
			return new CarFactory();
		} else if (type.equals(VehicleType.BIKE)) {
			return new BikeFactory();
		}
		return null;
	}
}
