package com.creational.factory_02membershipadmin;

import com.creational.abstractfactory_04membershipenums.Membership;
import com.creational.factory_01membershipentity.Member;
import com.creational.factory_03memberfactroy.MemberFactory;

public class MembershipManager {

	MemberFactory factory;
	Member member;

	public Member createMember(Membership membership) {
		member = factory.createMember(membership);
		return member;
	}

}
