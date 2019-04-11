package com.structural.decorator_01decoratedentity;

public class IndianPizza extends Pizza {

	public IndianPizza() {
		this.info = "Indian Pizza";
	}

	@Override
	public int cost() {
		return 250;
	}

}
