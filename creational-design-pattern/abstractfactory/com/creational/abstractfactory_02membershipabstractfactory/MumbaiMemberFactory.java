package com.creational.abstractfactory_02membershipabstractfactory;

import com.creational.abstractfactory_01membershipentity.Member;
import com.creational.abstractfactory_01membershipentity.MumbaiAnnualMember;
import com.creational.abstractfactory_01membershipentity.MumbaiLifetimeMember;
import com.creational.abstractfactory_01membershipentity.MumbaiTemporaryMember;
import com.creational.abstractfactory_04membershipenums.Membership;

public class MumbaiMemberFactory extends MemberAbstractFactory {

	@Override
	public Member createLocationMembership(Membership membership) {
		switch (membership) {
		case ANNUAL:
			return new MumbaiAnnualMember();
		case LIFETIME:
			return new MumbaiLifetimeMember();
		case TEMPORARY:
			return new MumbaiTemporaryMember();
		}
		return null;
	}
}
