package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_01bikeentity.Bike;
import com.creational.abstractfactory_01bikeentity.CBZBike;
import com.creational.abstractfactory_01bikeentity.PulsarBike;
import com.creational.abstractfactory_01bikeentity.YamahaBike;
import com.creational.abstractfactory_02carentity.Car;
import com.creational.abstractfactory_05enum.VehicleType;

public class BikeFactory extends AbstractFactory {

	@Override
	public Bike createBike(VehicleType type) {

		if (type.equals(VehicleType.CBZ)) {
			return new CBZBike(type);
		} else if (type.equals(VehicleType.PULSAR)) {
			return new PulsarBike(type);
		} else if (type.equals(VehicleType.YAMAHA)) {
			return new YamahaBike(type);
		}

		return null;
	}

	@Override
	public Car createCar(VehicleType vehicleType) {
		return null;
	}

}
