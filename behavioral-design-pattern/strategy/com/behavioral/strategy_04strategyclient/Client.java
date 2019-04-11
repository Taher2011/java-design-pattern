package com.behavioral.strategy_04strategyclient;

import com.behavioral.strategy_01strategyclass.Archer;
import com.behavioral.strategy_01strategyclass.Gunman;
import com.behavioral.strategy_01strategyclass.Palladin;
import com.behavioral.strategy_01strategyclass.Robot;
import com.behavioral.strategy_01strategyclass.Soldier;
import com.behavioral.strategy_03strategybehaviorimpl.ExternalRepair;
import com.behavioral.strategy_03strategybehaviorimpl.InternalRepair;
import com.behavioral.strategy_03strategybehaviorimpl.TimeBasedRefill;
import com.behavioral.strategy_03strategybehaviorimpl.WeaponBasedRefill;

public class Client {

	public static void main(String[] args) {

		Soldier soldier = null;

		soldier = new Archer();
		soldier.attack();
		soldier.doRefill(new WeaponBasedRefill());
		soldier.doRefill(new TimeBasedRefill());

		System.out.println();

		soldier = new Gunman();
		soldier.attack();
		soldier.doRefill(new TimeBasedRefill());

		System.out.println();

		soldier = new Palladin();
		soldier.attack();

		System.out.println();

		soldier = new Robot();
		soldier.attack();
		soldier.doRepair(new ExternalRepair());

		System.out.println();

		soldier.attack();
		soldier.doRepair(new InternalRepair());
	}

}
