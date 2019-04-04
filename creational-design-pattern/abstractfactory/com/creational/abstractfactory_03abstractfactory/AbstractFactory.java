package com.creational.abstractfactory_03abstractfactory;

import com.creational.abstractfactory_05enum.VehicleType;

public abstract class AbstractFactory<T> {

	public abstract T create(VehicleType vehicleType);

}
