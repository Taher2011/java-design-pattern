package com.creational.abstractfactory_01membershipentity;

public class MumbaiTemporaryMember extends Member {

	public MumbaiTemporaryMember() {
		super();
		this.location = "Mumbai";
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
