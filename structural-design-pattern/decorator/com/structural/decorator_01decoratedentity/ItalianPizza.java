package com.structural.decorator_01decoratedentity;

public class ItalianPizza extends Pizza {

	public ItalianPizza() {
		this.info = "Italian Pizza";
	}
	
	@Override
	public int cost() {
		return 350;
	}

}
