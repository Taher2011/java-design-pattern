package com.creational.singleton_01plainsingleton;

class Singleton {

	private static Singleton singleton;

	private Singleton() {
		super();
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}

public class PlainSingletonDemo {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getSingleton();
		System.out.println(singleton1.hashCode());

		Singleton singleton2 = Singleton.getSingleton();
		System.out.println(singleton2.hashCode());

		Singleton singleton3 = Singleton.getSingleton();
		System.out.println(singleton3.hashCode());
	}

}
