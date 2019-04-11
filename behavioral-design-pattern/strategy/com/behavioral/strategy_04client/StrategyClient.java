package com.behavioral.strategy_04client;

import com.behavioral.strategy_01soldiers.Archer;
import com.behavioral.strategy_01soldiers.Soldier;
import com.behavioral.strategy_02refill.Refillable;
import com.behavioral.strategy_02refill.TimeBaseRefill;
import com.behavioral.strategy_02refill.WeaponBaseRefill;

public class StrategyClient {

	public static void main(String[] args) {
		Refillable timeBasedRefillable = new TimeBaseRefill();
		Refillable weaponBasedRefillable = new WeaponBaseRefill();

		Soldier soldier = new Archer(timeBasedRefillable);
		soldier.attack();

		soldier = new Archer(weaponBasedRefillable);
		soldier.attack();
	}

}
