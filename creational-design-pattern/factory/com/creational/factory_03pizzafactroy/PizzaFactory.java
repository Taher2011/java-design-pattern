package com.creational.factory_03pizzafactroy;

import com.creational.factory_01pizza.CheesePizza;
import com.creational.factory_01pizza.NonVegPizza;
import com.creational.factory_01pizza.Pizza;
import com.creational.factory_01pizza.VegPizza;

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
