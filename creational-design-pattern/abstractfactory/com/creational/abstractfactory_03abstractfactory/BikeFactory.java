package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_01Bike.Bike;
import com.creational.abstractfactory_01Bike.CBZBike;
import com.creational.abstractfactory_01Bike.PulsarBike;
import com.creational.abstractfactory_01Bike.YamahaBike;
import com.creational.abstractfactory_05enum.VehicleType;

public class BikeFactory extends AbstractFactory<Bike> {

	@Override
	public Bike create(VehicleType type) {

		if (type.equals(VehicleType.CBZ)) {
			return new CBZBike(type);
		} else if (type.equals(VehicleType.PULSAR)) {
			return new PulsarBike(type);
		} else if (type.equals(VehicleType.YAMAHA)) {
			return new YamahaBike(type);
		}

		return null;
	}

}
