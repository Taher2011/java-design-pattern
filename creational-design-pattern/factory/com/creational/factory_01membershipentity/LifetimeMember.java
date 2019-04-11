package com.creational.factory_01membershipentity;

public class LifetimeMember extends Member {

	public LifetimeMember() {
		super();
		this.memberType = "Lifetime Member";
	}

	@Override
	public void register() {
		System.out.println(getMemberType() + " registered");
	}

	@Override
	public void notified() {
		System.out.println(getMemberType() + " notified");
	}

}
