package com.behavioral.strategy_03strategybehaviorimpl;

import com.behavioral.strategy_02strategybehavior.Refillable;

public class TimeBasedRefill implements Refillable {

	@Override
	public void refill() {
		System.out.println("Time based Refilling");
	}

}
