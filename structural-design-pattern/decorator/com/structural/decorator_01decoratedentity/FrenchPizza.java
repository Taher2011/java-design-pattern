package com.structural.decorator_01decoratedentity;

public class FrenchPizza extends Pizza {

	public FrenchPizza() {
		this.info = "French Pizza";
	}

	@Override
	public int cost() {
		return 450;
	}

}
