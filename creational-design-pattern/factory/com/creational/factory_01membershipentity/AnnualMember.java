package com.creational.factory_01membershipentity;

public class AnnualMember extends Member {

	public AnnualMember() {
		super();
		this.memberType = "Annual Member";
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
