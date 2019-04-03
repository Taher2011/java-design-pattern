package com.creational.factory._02pizzastore;

import com.creational.factory._01pizza.Pizza;
import com.creational.factory._03pizzafactroy.PizzaFactory;

public class PizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = PizzaFactory.createPizza(pizzaType);
		return pizza;
	}

}
