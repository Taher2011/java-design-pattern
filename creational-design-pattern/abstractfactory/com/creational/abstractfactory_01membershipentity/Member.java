package com.creational.abstractfactory_01membershipentity;

public abstract class Member {

	public String memberType;
	public String location;

	public String getMemberType() {
		return memberType;
	}

	public String getLocation() {
		return location;
	}

	public abstract void register();

	public abstract void notified();

}
