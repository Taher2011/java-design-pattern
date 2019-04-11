package com.behavioral.strategy_04soldierclient;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.strategy_01soldier.Archer;
import com.behavioral.strategy_01soldier.Gunman;
import com.behavioral.strategy_01soldier.Palladin;
import com.behavioral.strategy_01soldier.Robot;
import com.behavioral.strategy_01soldier.Soldier;

public class Client {

	public static void main(String[] args) {

		List<Soldier> soldierList = new ArrayList<>();
		soldierList.add(new Palladin());
		soldierList.add(new Gunman());
		soldierList.add(new Archer());
		soldierList.add(new Robot());

		for (Soldier soldier : soldierList) {
			soldier.attack();
		}

	}

}
