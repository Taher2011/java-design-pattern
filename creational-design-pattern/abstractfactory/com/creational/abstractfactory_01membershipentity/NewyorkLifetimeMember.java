package com.creational.abstractfactory_01membershipentity;

public class NewyorkLifetimeMember extends Member {

	public NewyorkLifetimeMember() {
		super();
		this.location = "Newyork";
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
