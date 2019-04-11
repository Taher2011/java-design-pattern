package com.behavioral.observer_01observer;

import com.behavioral.observer_03observable.Weather;

public interface Observer {

	void update(Weather weather);

	void display();

}
