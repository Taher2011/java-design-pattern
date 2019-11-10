package com.creational.abstractfactory_05membershipclient;

import com.creational.abstractfactory_01membershipentity.Member;
import com.creational.abstractfactory_02membershipabstractfactory.MemberAbstractFactory;
import com.creational.abstractfactory_03membershipfactory.MemberFactory;
import com.creational.abstractfactory_04membershipenums.Membership;

public class MembershipClient {

	public static void main(String[] args) {

		MemberAbstractFactory abstractFactory = MemberFactory.createLocationSpecificFctory(Membership.NEWYORK);
		if (abstractFactory != null) {
			Member member = abstractFactory.createMembership(Membership.ANNUAL);
			if (member == null) {
				{
					System.out.println("Membership is not valid");
				}
			}
		} else {
			System.out.println("Location is not valid");
		}
	}
}
