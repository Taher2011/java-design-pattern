package com.behavioral.strategy_03strategybehaviorimpl;

import com.behavioral.strategy_02strategybehavior.Repairable;

public class ExternalRepair implements Repairable {

	@Override
	public void repair() {
		System.out.println("External Repairing");
	}

}
