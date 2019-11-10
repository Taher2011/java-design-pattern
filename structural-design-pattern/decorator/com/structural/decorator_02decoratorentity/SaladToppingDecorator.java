package com.structural.decorator_02decoratorentity;

import com.structural.decorator_01decoratedentity.Pizza;

public class SaladToppingDecorator extends ToppingsDecorator {


	public SaladToppingDecorator(Pizza pizza) {
		super(pizza);
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
