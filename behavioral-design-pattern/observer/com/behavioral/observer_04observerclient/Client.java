package com.behavioral.observer_04observerclient;

import com.behavioral.observer_01observer.Observer;
import com.behavioral.observer_02observerimpl.Laptop;
import com.behavioral.observer_02observerimpl.Mobile;
import com.behavioral.observer_03observable.WeatherStation;

public class Client {

	public static void main(String[] args) {

		WeatherStation weatherStation = new WeatherStation();
		Observer observerMobile = new Mobile(weatherStation);
		Observer observerLaptop = new Laptop(weatherStation);

		weatherStation.setTemperature(40);
		weatherStation.notifyObservers();

		System.out.println();

		weatherStation.setTemperature(30);
		weatherStation.notifyObservers();

		System.out.println();

		weatherStation.removeObserver(observerLaptop);

		weatherStation.setTemperature(20);
		weatherStation.notifyObservers();

	}

}
