package com.creational.factory_05membershipclient;

import com.creational.factory_01membershipentity.Member;
import com.creational.factory_02membershipadmin.MembershipManager;
import com.creational.factory_04membershipenums.Membership;

public class MembershipClient {

	public static void main(String[] args) {

		MembershipManager manager = new MembershipManager();
		Member member = manager.createMember(Membership.ENQUIRE);
		if (member != null) {
			member.register();
			member.notified();
		} else {
			System.out.println("Not valid Membership Type");
		}
	}

}
