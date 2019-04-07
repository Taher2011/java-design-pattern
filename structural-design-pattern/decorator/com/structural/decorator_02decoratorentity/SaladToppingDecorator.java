package com.structural.decorator_02decoratorentity;

import com.structural.decorator_01decoratedentity.Pizza;

public class SaladToppingDecorator extends ToppingsDecorator {

	Pizza pizza;

	public SaladToppingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getInfo() {
		return "Salad "+ pizza.getInfo();
	}

	@Override
	public int cost() {
		return 60 + pizza.cost();
	}

}
