package com.creational.abstractfactory_02membershipabstractfactory;

import com.creational.abstractfactory_01membershipentity.Member;
import com.creational.abstractfactory_01membershipentity.ParisAnnualMember;
import com.creational.abstractfactory_01membershipentity.ParisLifetimeMember;
import com.creational.abstractfactory_01membershipentity.ParisTemporaryMember;
import com.creational.abstractfactory_04membershipenums.Membership;

public class ParisMemberFactory extends MemberAbstractFactory {

	@Override
	public Member createLocationMembership(Membership membership) {
		switch (membership) {
		case ANNUAL:
			return new ParisAnnualMember();
		case LIFETIME:
			return new ParisLifetimeMember();
		case TEMPORARY:
			return new ParisTemporaryMember();
		}
		return null;
	}
}
