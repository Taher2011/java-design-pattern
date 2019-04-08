package com.creational.factory_01membershipentity;

public class TemporaryMember extends Member {

	public TemporaryMember() {
		super();
		this.memberType = "Temporary Member";
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
