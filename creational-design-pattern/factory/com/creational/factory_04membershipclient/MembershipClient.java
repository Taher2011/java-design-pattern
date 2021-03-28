package com.creational.factory_04membershipclient;

import com.creational.factory_01membershipentity.Member;
import com.creational.factory_02memberfactroy.MemberFactory;
import com.creational.factory_03membershipenums.Membership;

public class MembershipClient {

	public static void main(String[] args) {

		Member member = MemberFactory.createMember(Membership.LIFETIME);
		if (member != null) {
			member.register();
			member.notified();
		} else {
			System.out.println("Not valid Membership Type");
		}
	}

}
