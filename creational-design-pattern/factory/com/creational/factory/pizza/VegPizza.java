package com.creational.factory.pizza;

public class VegPizza implements Pizza {

	public void preparePizza() {
		System.out.println("Preparing Veg Pizza");
	}

	public void bakePizza() {
		System.out.println("Baking Veg Pizza");
	}

	public void cutPizza() {
		System.out.println("Cutting Veg Pizza");
	}

	public void deliveredPizza() {
		System.out.println("Delivered Veg Pizza");
	}

}
