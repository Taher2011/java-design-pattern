package com.creational.factory_01pizzaentity;

public class CheesePizza implements Pizza {

	public void preparePizza() {
		System.out.println("Preparing Cheese Pizza");
	}

	public void bakePizza() {
		System.out.println("Baking Cheese Pizza");
	}

	public void cutPizza() {
		System.out.println("Cutting Cheese Pizza");
	}

	public void deliveredPizza() {
		System.out.println("Delivered Cheese Pizza");
	}

}
