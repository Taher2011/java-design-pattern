package com.behavioral.strategy_03strategyimpl;

import com.behavioral.strategy_02strategy.Repairable;

public class InternalRepair implements Repairable {

	@Override
	public void repair() {
		System.out.println("Internal Repairing");
	}

}
