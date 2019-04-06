package com.creational.abstractfactory_06client;

import com.creational.abstractfactory_01bikeentity.Bike;
import com.creational.abstractfactory_02carentity.Car;
import com.creational.abstractfactory_03abstractfactory.AbstractFactory;
import com.creational.abstractfactory_04factory.Factory;
import com.creational.abstractfactory_05enum.VehicleType;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = null;

		factory = Factory.createFactory(VehicleType.CAR);
		if (factory != null) {
			Car car = factory.createCar(VehicleType.LEMOZENE);
			if (car != null) {
				car.specification();
			}
		}

		factory = Factory.createFactory(VehicleType.BIKE);
		if (factory != null) {
			Bike bike = factory.createBike(VehicleType.CBZ);
			if (bike != null) {
				bike.specification();
			}
		}

	}

}
