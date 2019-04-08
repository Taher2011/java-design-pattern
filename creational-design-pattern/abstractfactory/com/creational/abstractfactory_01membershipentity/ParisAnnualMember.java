package com.creational.abstractfactory_01membershipentity;

public class ParisAnnualMember extends Member {

	public ParisAnnualMember() {
		super();
		this.location = "Paris";
		this.memberType = "Annual Member";
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
