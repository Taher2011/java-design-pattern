package com.structural.facade_03facadeclient;

import com.structural.facade_02facade.MobileStoreFacade;

public class Client {

	public static void main(String[] args) {
		MobileStoreFacade facade = new MobileStoreFacade();
		facade.getMobileDetails("Oppo");
	}

}
