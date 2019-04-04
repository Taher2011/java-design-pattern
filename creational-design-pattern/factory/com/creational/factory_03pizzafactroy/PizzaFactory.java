package com.creational.factory_03pizzafactroy;

import com.creational.factory_01pizza.CheesePizza;
import com.creational.factory_01pizza.NonVegPizza;
import com.creational.factory_01pizza.Pizza;
import com.creational.factory_01pizza.VegPizza;
import com.creational.factory_04pizzaenum.PizzaType;

public class PizzaFactory {

	public static Pizza createPizza(PizzaType pizzaType) {
		Pizza pizza = null;
		if (pizzaType.equals(PizzaType.CHEESE)) {
			pizza = new CheesePizza();
		} else if (pizzaType.equals(PizzaType.VEG)) {
			pizza = new VegPizza();
		} else if (pizzaType.equals(PizzaType.NONVEG)) {
			pizza = new NonVegPizza();
		}
		return pizza;
	}

}
