package com.structural.decorator_02decoratorentity;

import com.structural.decorator_01decoratedentity.Pizza;

public abstract class ToppingsDecorator extends Pizza {

	Pizza pizza;

	public ToppingsDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

}
