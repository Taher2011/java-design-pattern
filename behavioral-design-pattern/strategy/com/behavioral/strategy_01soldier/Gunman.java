package com.behavioral.strategy_01soldier;

public class Gunman extends Soldier {

	public Gunman() {
		super();
		this.soldierType = "Gunman";
	}

	@Override
	public void attack() {
		int i = 20;
		System.out.println(soldierType + " is attacking");
		while (i > 0) {
			i--;
			if (i == 0) {
				System.out.println(soldierType
						+ " is low on bullets, need to refill");
			}
		}
	}

}
