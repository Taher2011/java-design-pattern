package com.creational.factory_05pizzaclient;

import com.creational.factory_01pizzaentity.Pizza;
import com.creational.factory_02pizzastore.PizzaStore;
import com.creational.factory_04pizzaenum.PizzaType;

public class PizzaClient {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		Pizza pizza = pizzaStore.orderPizza(PizzaType.CHEESE);
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();
		pizza.deliveredPizza();
	}

}
