package com.behavioral.observer_04client;

import com.behavioral.observer_01subscriber.Subscriber;
import com.behavioral.observer_02subscriberimpl.LaptopSubscriber;
import com.behavioral.observer_02subscriberimpl.MobileSubscriber;
import com.behavioral.observer_03publisher.WeatherStationPublisher;

public class Client {

	public static void main(String[] args) {

		WeatherStationPublisher weatherStation = new WeatherStationPublisher();
		Subscriber observerMobile = new MobileSubscriber(weatherStation);
		Subscriber observerLaptop = new LaptopSubscriber(weatherStation);

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
