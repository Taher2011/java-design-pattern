package com.behavioral.observer_02subscriberimpl;

import com.behavioral.observer_01subscriber.Subscriber;
import com.behavioral.observer_03publisher.WeatherStationPublisher;

public class MobileSubscriber implements Subscriber {

	WeatherStationPublisher weatherStation;

	public MobileSubscriber(WeatherStationPublisher weatherStation) {
		super();
		this.weatherStation = weatherStation;
		weatherStation.registerSubscriber(this);
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
