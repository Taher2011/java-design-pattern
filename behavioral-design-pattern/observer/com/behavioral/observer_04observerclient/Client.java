package com.behavioral.observer_04observerclient;

import com.behavioral.observer_01observer.Observer;
import com.behavioral.observer_02observerimpl.Laptop;
import com.behavioral.observer_02observerimpl.Mobile;
import com.behavioral.observer_03observable.WeatherStation;

public class Client {

	public static void main(String[] args) {

		WeatherStation weather = new WeatherStation();
		Observer observerMobile = new Mobile(weather);
		Observer observerLaptop = new Laptop(weather);

		weather.setTemperature(40);
		weather.notifyObservers();

		System.out.println();

		weather.setTemperature(30);
		weather.notifyObservers();

		System.out.println();

		weather.removeObserver(observerLaptop);

		weather.setTemperature(20);
		weather.notifyObservers();

	}

}
