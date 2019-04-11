package com.structural.decorator_03decoratorclient;

import com.structural.decorator_01decoratedentity.FrenchPizza;
import com.structural.decorator_01decoratedentity.Pizza;
import com.structural.decorator_02decoratorentity.CheeseToppingDecorator;
import com.structural.decorator_02decoratorentity.SaladToppingDecorator;
import com.structural.decorator_02decoratorentity.SausageToppingDecorator;

public class Client {

	public static void main(String[] args) {

		Pizza pizza = new FrenchPizza();
		pizza = new CheeseToppingDecorator(pizza);
		pizza = new SaladToppingDecorator(pizza);
		pizza = new SausageToppingDecorator(pizza);

		System.out.println(pizza.getInfo() + " cost is " + pizza.cost());
		

	}

}
