package com.creational.abstractfactory_02membershipabstractfactory;

import com.creational.abstractfactory_01membershipentity.Member;
import com.creational.abstractfactory_01membershipentity.NewyorkAnnualMember;
import com.creational.abstractfactory_01membershipentity.NewyorkLifetimeMember;
import com.creational.abstractfactory_01membershipentity.NewyorkTemporaryMember;
import com.creational.abstractfactory_04membershipenums.Membership;

public class NewyorkMemberFactory extends MemberAbstractFactory {

	@Override
	public Member createLocationMembership(Membership membership) {
		switch (membership) {
		case ANNUAL:
			return new NewyorkAnnualMember();
		case LIFETIME:
			return new NewyorkLifetimeMember();
		case TEMPORARY:
			return new NewyorkTemporaryMember();
		}
		return null;
	}
}
