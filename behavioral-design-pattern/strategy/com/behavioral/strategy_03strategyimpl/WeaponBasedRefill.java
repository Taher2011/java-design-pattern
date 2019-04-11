package com.behavioral.strategy_03strategyimpl;

import com.behavioral.strategy_02strategy.Refillable;

public class WeaponBasedRefill implements Refillable {

	@Override
	public void refill() {
		System.out.println("Weapon Based Refilling");
	}

}
