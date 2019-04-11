package com.creational.abstractfactory_01membershipentity;

public class ParisTemporaryMember extends Member {

	public ParisTemporaryMember() {
		super();
		this.location = "Paris";
		this.memberType = "Temporary Member";
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
