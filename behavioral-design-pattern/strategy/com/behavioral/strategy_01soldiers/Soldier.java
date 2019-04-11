package com.behavioral.strategy_01soldiers;

import com.behavioral.strategy_02refill.Refillable;
import com.behavioral.strategy_03repair.Repairable;

public abstract class Soldier {

	Refillable refillable;
	Repairable repairable;

	public abstract void attack();

	public void gather() {

	}

}
