package com.creational.abstractfactory_01membershipentity;

public class NewyorkAnnualMember extends Member {

	public NewyorkAnnualMember() {
		super();
		this.location = "Newyork";
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
