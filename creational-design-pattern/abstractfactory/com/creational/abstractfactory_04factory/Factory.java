package com.creational.abstractfactory_04factory;

import com.creational.abstractfactory_03abstractfactory.AbstractFactory;
import com.creational.abstractfactory_05enum.VehicleType;

public class Factory<T> {

	public T create(AbstractFactory<T> abstractFactory, VehicleType type) {
		return abstractFactory.create(type);
	}
}
