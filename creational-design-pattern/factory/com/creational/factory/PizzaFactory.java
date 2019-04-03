package com.creational.factory;

import com.creational.factory.pizza.CheesePizza;
import com.creational.factory.pizza.NonVegPizza;
import com.creational.factory.pizza.Pizza;
import com.creational.factory.pizza.VegPizza;

public class PizzaFactory {

	public static Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		if (pizzaType.equals("Cheese")) {
			pizza = new CheesePizza();
		} else if (pizzaType.equals("Veg")) {
			pizza = new VegPizza();
		} else if (pizzaType.equals("NonVeg")) {
			pizza = new NonVegPizza();
		}
		return pizza;
	}

}
