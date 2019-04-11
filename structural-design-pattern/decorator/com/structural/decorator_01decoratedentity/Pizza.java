package com.structural.decorator_01decoratedentity;

public abstract class Pizza {

	protected String info;

	public String getInfo() {
		return info;
	}

	public abstract int cost();

	@Override
	public String toString() {
		return "Pizza is = " + info + cost();
	}

}
