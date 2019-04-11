package com.behavioral.strategy_01soldier;

public class Robot extends Soldier {

	public Robot() {
		super();
		this.soldierType = "Robot";
	}

	@Override
	public void attack() {
		System.out.println(soldierType + " is attacking");
	}

}
