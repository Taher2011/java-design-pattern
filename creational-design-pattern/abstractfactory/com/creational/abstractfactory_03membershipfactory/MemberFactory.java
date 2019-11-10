package com.creational.abstractfactory_03membershipfactory;

import com.creational.abstractfactory_02membershipabstractfactory.MemberAbstractFactory;
import com.creational.abstractfactory_02membershipabstractfactory.MumbaiMemberFactory;
import com.creational.abstractfactory_02membershipabstractfactory.NewyorkMemberFactory;
import com.creational.abstractfactory_02membershipabstractfactory.ParisMemberFactory;
import com.creational.abstractfactory_04membershipenums.Membership;

public class MemberFactory {

	public static MemberAbstractFactory createLocationSpecificFctory(Membership membership) {
		switch (membership) {
		case MUMBAI:
			return new MumbaiMemberFactory();
		case NEWYORK:
			return new NewyorkMemberFactory();
		case PARIS:
			return new ParisMemberFactory();
		}
		return null;
	}

}
