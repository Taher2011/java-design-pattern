package com.creational.factory_01membershipentity;

public abstract class Member {

	public String memberType;

	public String getMemberType() {
		return memberType;
	}

	public abstract void register();

	public abstract void notified();

}
