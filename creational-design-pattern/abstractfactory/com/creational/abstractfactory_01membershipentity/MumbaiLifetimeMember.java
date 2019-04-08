package com.creational.abstractfactory_01membershipentity;

public class MumbaiLifetimeMember extends Member {

	public MumbaiLifetimeMember() {
		super();
		this.location = "Mumbai";
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
