package com.behavioral.observer_03observable;

import java.util.ArrayList;
import java.util.List;

import com.behavioral.observer_01observer.Observer;

public class Weather {

	private int temperature;

	private List<Observer> observers = null;

	public Weather() {
		super();
		observers = new ArrayList<>();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
