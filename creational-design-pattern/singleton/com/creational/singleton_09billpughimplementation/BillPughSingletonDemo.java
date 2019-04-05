package com.creational.singleton_09billpughimplementation;

class Singleton {

	// an instance attribute
	private int data = 0;

	private Singleton() {
		super();
	}

	// Doesn't require synchronization, is thread safe
	private static class SingletonHelper {
		private static Singleton singleton = new Singleton();
	}

	public static Singleton getSingleton() {
		return SingletonHelper.singleton;
	}

	public void setData(int myData) {
		data = myData;
	}

	public int getData() {
		return data;
	}
}

public class BillPughSingletonDemo {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getSingleton();
		singleton1.setData(55);
		System.out.println("First reference: " + singleton1.hashCode());
		System.out.println("Singleton data value is: " + singleton1.getData());

		System.out.println();

		Singleton singleton2 = Singleton.getSingleton();
		System.out.println("Second reference: " + singleton2.hashCode());
		System.out.println("Singleton data value is: " + singleton2.getData());

	}

}
