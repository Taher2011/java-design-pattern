package com.behavioral.strategy_04soldierclient;

import com.behavioral.strategy_01soldier.Archer;
import com.behavioral.strategy_01soldier.Gunman;
import com.behavioral.strategy_01soldier.Palladin;
import com.behavioral.strategy_01soldier.Robot;
import com.behavioral.strategy_01soldier.Soldier;
import com.behavioral.strategy_03strategyimpl.ExternalRepair;
import com.behavioral.strategy_03strategyimpl.InternalRepair;
import com.behavioral.strategy_03strategyimpl.TimeBasedRefill;
import com.behavioral.strategy_03strategyimpl.WeaponBasedRefill;

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
