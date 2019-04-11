package com.behavioral.strategy_01strategyclass;

public class Robot extends Soldier {

	public Robot() {
		super();
		this.soldierType = "Robot";
	}

	@Override
	public void attack() {
		int i = 5;
		System.out.println(soldierType + " is attacking");
		while (i > 0) {
			i--;
			if (i == 0) {
				System.out.println(soldierType + " is damaged, need to repair");
			}
		}
	}

}
