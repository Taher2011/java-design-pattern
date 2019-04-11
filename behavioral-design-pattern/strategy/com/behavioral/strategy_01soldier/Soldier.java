package com.behavioral.strategy_01soldier;

import com.behavioral.strategy_02strategy.Refillable;
import com.behavioral.strategy_02strategy.Repairable;

public abstract class Soldier {

	Refillable refillable;
	Repairable repairable;
	String soldierType;

	public abstract void attack();

	public void refill(Refillable refillable) {
		this.refillable = refillable;
		System.out.print(soldierType + " is now refilling ");
		refillable.refill();
	}

}
