package com.creational.factory_03memberfactroy;

import com.creational.abstractfactory_04membershipenums.Membership;
import com.creational.factory_01membershipentity.AnnualMember;
import com.creational.factory_01membershipentity.LifetimeMember;
import com.creational.factory_01membershipentity.Member;
import com.creational.factory_01membershipentity.TemporaryMember;

public class MemberFactory {

	public static Member createMember(Membership membership) {
		Member member = null;
		switch (membership) {
		case ANNUAL:
			member = new AnnualMember();
			break;
		case LIFETIME:
			member = new LifetimeMember();
			break;
		case TEMPORARY:
			member = new TemporaryMember();
			break;
		}
		return member;
	}

}
