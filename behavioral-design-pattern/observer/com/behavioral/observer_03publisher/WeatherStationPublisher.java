package com.behavioral.observer_03publisher;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.observer_01subscriber.Subscriber;

public class WeatherStationPublisher {

	private int temperature;

	private List<Subscriber> subscribers = null;

	public WeatherStationPublisher() {
		super();
		subscribers = new ArrayList<>();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void registerObserver(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void removeObserver(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	public void notifyObservers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update();
		}
	}

}
