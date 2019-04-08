package com.creational.abstractfactory_01membershipentity;

public class NewyorkTemporaryMember extends Member {

	public NewyorkTemporaryMember() {
		super();
		this.location = "Newyork";
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
