package com.structural.facade_03client;

import com.structural.facade_02facade.MobileStoreFacade;

public class Client {

	public static void main(String[] args) {
		MobileStoreFacade facade = new MobileStoreFacade();
		facade.getMobileDetails("Apple");
	}

}
