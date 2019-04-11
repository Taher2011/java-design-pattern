package com.behavioral.strategy_01soldier;

public class Palladin extends Soldier {
	
	public Palladin() {
		super();
		this.soldierType = "Palladin";
	}

	@Override
	public void attack() {
		System.out.println(soldierType + " is attacking");
	}

}
