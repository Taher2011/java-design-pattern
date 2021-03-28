package com.creational.factory_02memberfactroy;

import com.creational.factory_01membershipentity.AnnualMember;
import com.creational.factory_01membershipentity.LifetimeMember;
import com.creational.factory_01membershipentity.Member;
import com.creational.factory_01membershipentity.TemporaryMember;
import com.creational.factory_03membershipenums.Membership;

public class MemberFactory {

	private MemberFactory() {
		super();
	}

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
		default:
			break;
		}
		return member;
	}

}
