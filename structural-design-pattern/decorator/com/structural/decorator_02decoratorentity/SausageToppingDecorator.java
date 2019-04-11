package com.structural.decorator_02decoratorentity;

import com.structural.decorator_01decoratedentity.Pizza;

public class SausageToppingDecorator extends ToppingsDecorator {

	Pizza pizza;

	public SausageToppingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getInfo() {
		return "Sausage " + pizza.getInfo();
	}

	@Override
	public int cost() {
		return 70 + pizza.cost();
	}

}
