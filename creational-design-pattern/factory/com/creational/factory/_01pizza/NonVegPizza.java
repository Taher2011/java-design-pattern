package com.creational.factory._01pizza;

public class NonVegPizza implements Pizza {

	public void preparePizza() {
		System.out.println("Preparing NonVeg Pizza");
	}

	public void bakePizza() {
		System.out.println("Baking NonVeg Pizza");
	}

	public void cutPizza() {
		System.out.println("Cutting NonVeg Pizza");
	}

	public void deliveredPizza() {
		System.out.println("Delivered NonVeg Pizza");
	}

}
