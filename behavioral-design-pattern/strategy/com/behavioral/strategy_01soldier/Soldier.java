package com.behavioral.strategy_01soldier;

import com.behavioral.strategy_02strategy.Refillable;
import com.behavioral.strategy_02strategy.Repairable;

public abstract class Soldier {

	Refillable refillable;
	Repairable repairable;
	String soldierType;

	public abstract void attack();

	public void doRefill(Refillable refillable) {
		this.refillable = refillable;
		System.out.print(soldierType + " is now refilling ");
		refillable.refill();
	}

	public void doRepair(Repairable repairable) {
		this.repairable = repairable;
		System.out.print(soldierType + " is now repairing by ");
		repairable.repair();
	}

}
