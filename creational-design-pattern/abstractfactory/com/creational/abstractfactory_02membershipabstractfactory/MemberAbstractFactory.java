package com.creational.abstractfactory_02membershipabstractfactory;

import com.creational.abstractfactory_01membershipentity.Member;
import com.creational.abstractfactory_04membershipenums.Membership;

public abstract class MemberAbstractFactory {

	public Member createMembership(Membership membership) {
		Member member = createLocationMembership(membership);
		return member;
	}

	public abstract Member createLocationMembership(Membership membership);

}
