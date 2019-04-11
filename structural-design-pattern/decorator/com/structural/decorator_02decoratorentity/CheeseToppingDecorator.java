package com.structural.decorator_02decoratorentity;

import com.structural.decorator_01decoratedentity.Pizza;

public class CheeseToppingDecorator extends ToppingsDecorator {

	Pizza pizza;

	public CheeseToppingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getInfo() {
		return "Cheese " + pizza.getInfo();
	}

	@Override
	public int cost() {
		return 50 + pizza.cost();
	}

}
