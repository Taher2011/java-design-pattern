package com.behavioral.observer_02observerimpl;

import com.behavioral.observer_01observer.Observer;
import com.behavioral.observer_03observable.Weather;

public class Mobile implements Observer {
	
	Weather weather;

	public Mobile(Weather weather) {
		super();
		this.weather = weather;
		weather.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Mobile Displaying Temperature is "
				+ weather.getTemperature());
	}

	@Override
	public void display() {

	}

}
