package com.creational.abstractfactory_06client;

import com.creational.abstractfactory_01bike.Bike;
import com.creational.abstractfactory_02car.Car;
import com.creational.abstractfactory_03abstractfactory.AbstractFactory;
import com.creational.abstractfactory_04factory.Factory;
import com.creational.abstractfactory_05enum.VehicleType;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory = null;
		
		factory = Factory.createFactory(VehicleType.CAR);
		Car car = factory.createCar(VehicleType.LEMOZENE);
		car.specification();

		factory = Factory.createFactory(VehicleType.BIKE);
		Bike bike = factory.createBike(VehicleType.CBZ);
		bike.specification();
	}

}
