package com.creational.factory.client;

import com.creational.factory.pizza.Pizza;
import com.creational.factory.pizzastore.PizzaStore;

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
