package com.behavioral.strategy_01soldier;

public class Archer extends Soldier {

	public Archer() {
		super();
		this.soldierType = "Archer";
	}

	@Override
	public void attack() {
		int i = 5;
		System.out.println(soldierType + " is attacking");
		while (i > 0) {
			i--;
			if (i == 0) {
				System.out.println(soldierType
						+ " is low on bows, need to refill");
			}
		}
	}

}
