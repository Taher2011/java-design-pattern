package com.creational.abstractfactory_06client;

import com.creational.abstractfactory_01bike.Bike;
import com.creational.abstractfactory_02car.Car;
import com.creational.abstractfactory_03abstractfactory.BikeFactory;
import com.creational.abstractfactory_03abstractfactory.CarFactory;
import com.creational.abstractfactory_04factory.Factory;
import com.creational.abstractfactory_05enum.VehicleType;

public class Client {

	public static void main(String[] args) {
		Car car = new Factory<Car>().create(new CarFactory(), VehicleType.DMW);
		car.specification();

		Bike bike = new Factory<Bike>().create(new BikeFactory(), VehicleType.CBZ);
		bike.specification();
	}

}
