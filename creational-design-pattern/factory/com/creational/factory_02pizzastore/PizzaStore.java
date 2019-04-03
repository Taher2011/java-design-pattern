package com.creational.factory_02pizzastore;

import com.creational.factory_01pizza.Pizza;
import com.creational.factory_03pizzafactroy.PizzaFactory;

public class PizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = PizzaFactory.createPizza(pizzaType);
		return pizza;
	}

}
