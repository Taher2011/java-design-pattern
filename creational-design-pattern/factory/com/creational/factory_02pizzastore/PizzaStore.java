package com.creational.factory_02pizzastore;

import com.creational.factory_01pizzaentity.Pizza;
import com.creational.factory_03pizzafactroy.PizzaFactory;
import com.creational.factory_04pizzaenum.PizzaType;

public class PizzaStore {

	public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = PizzaFactory.createPizza(pizzaType);
		return pizza;
	}

}
