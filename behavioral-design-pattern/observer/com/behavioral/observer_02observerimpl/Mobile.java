package com.behavioral.observer_02observerimpl;

import com.behavioral.observer_01observer.Observer;
import com.behavioral.observer_03observable.WeatherStation;

public class Mobile implements Observer {

	WeatherStation weatherStation;

	public Mobile(WeatherStation weatherStation) {
		super();
		this.weatherStation = weatherStation;
		weatherStation.registerObserver(this);
	}

	@Override
	public void update() {
		int temperature = weatherStation.getTemperature();
		display(temperature);
	}

	@Override
	public void display(int temperature) {
		System.out.println("Mobile Displaying Temperature is " + temperature);
	}

}
