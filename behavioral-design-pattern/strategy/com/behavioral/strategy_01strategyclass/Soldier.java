package com.behavioral.strategy_01strategyclass;

import com.behavioral.strategy_02strategybehavior.Refillable;
import com.behavioral.strategy_02strategybehavior.Repairable;

public abstract class Soldier {

	Refillable refillable;
	Repairable repairable;
	String soldierType;

	public abstract void attack();

	public void setRefillable(Refillable refillable) {
		this.refillable = refillable;
		System.out.print(soldierType + " is now refilling ");
		refillable.refill();
	}

	public void setRepairable(Repairable repairable) {
		this.repairable = repairable;
		System.out.print(soldierType + " is now repairing by ");
		repairable.repair();
	}

}
