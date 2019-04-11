package com.behavioral.strategy_01soldiers;

import com.behavioral.strategy_02refill.Refillable;

public class Archer extends Soldier {

	public Archer(Refillable refillable) {
		super();
		this.refillable = refillable;
	}

	@Override
	public void attack() {
		System.out.println("Archer attacked");
		refillable.refill();
	}

}
