package com.behavioral.observer_02observerimpl;

import com.behavioral.observer_01observer.Observer;
import com.behavioral.observer_03observable.WeatherStation;

public class Laptop implements Observer {

	WeatherStation weather;

	public Laptop(WeatherStation weather) {
		super();
		this.weather = weather;
		weather.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Laptop Displaying Temperature is "
				+ weather.getTemperature());
	}

	@Override
	public void display() {

	}

}
