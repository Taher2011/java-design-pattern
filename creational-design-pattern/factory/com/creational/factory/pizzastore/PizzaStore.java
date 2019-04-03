package com.creational.factory.pizzastore;

import com.creational.factory.PizzaFactory;
import com.creational.factory.pizza.Pizza;

public class PizzaStore {

	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = PizzaFactory.createPizza(pizzaType);
		return pizza;
	}

}
