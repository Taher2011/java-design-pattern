package com.creational.singleton_01plainsingleton;

class Singleton {

	private int data = 0;

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

	public void setData(int myData) {
		data = myData;
	}

	public int getData() {
		return data;
	}
}

public class PlainSingletonDemo {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getSingleton();
		singleton1.setData(55);
		System.out.println("First reference: " + singleton1.hashCode());
		System.out.println("Singleton data value is: " + singleton1.getData());

		System.out.println();
		
		Singleton singleton2 = Singleton.getSingleton();
		System.out.println("Second reference: " + singleton2.hashCode());
		System.out.println("Singleton data value is: " + singleton2.getData());

		System.out.println();
		
		Singleton singleton3 = Singleton.getSingleton();
		System.out.println("Third reference: " + singleton3.hashCode());
		System.out.println("Singleton data value is: " + singleton3.getData());
	}

}
