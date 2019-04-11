package com.creational.builder_03client;

import com.creational.builder_01phoneentity.Phone;
import com.creational.builder_02phonebuilder.PhoneBuilder;

public class Client {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setOs("Android").setProcessor("5GB").phoneBuilder();
		System.out.println(phone);

	}

}
