package com.creational.abstractfactory_01membershipentity;

public class MumbaiAnnualMember extends Member {

	public MumbaiAnnualMember() {
		super();
		this.location = "Mumbai";
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
