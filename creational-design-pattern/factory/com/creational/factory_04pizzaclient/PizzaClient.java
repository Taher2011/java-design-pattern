package com.creational.factory_04pizzaclient;

import com.creational.factory_01pizza.Pizza;
import com.creational.factory_02pizzastore.PizzaStore;

public class PizzaClient {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		Pizza pizza = pizzaStore.orderPizza("NonVeg");
		pizza.preparePizza();
		pizza.bakePizza();
		pizza.cutPizza();
		pizza.deliveredPizza();
	}

}
