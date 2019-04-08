package com.creational.abstractfactory_01membershipentity;

public class ParisLifetimeMember extends Member {

	public ParisLifetimeMember() {
		super();
		this.location = "Paris";
		this.memberType = "Lifetime Member";
	}

	@Override
	public void register() {
		System.out.println(getMemberType() + " for " + getLocation() + " location registered");
	}

	@Override
	public void notified() {
		System.out.println(getMemberType() + " for " + getLocation() + " location notified");
	}

}
