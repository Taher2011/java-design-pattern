package com.structural.decorator_02decoratorentity;

import com.structural.decorator_01decoratedentity.Pizza;

public class SausageToppingDecorator extends ToppingsDecorator {


	public SausageToppingDecorator(Pizza pizza) {
		super(pizza);
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
