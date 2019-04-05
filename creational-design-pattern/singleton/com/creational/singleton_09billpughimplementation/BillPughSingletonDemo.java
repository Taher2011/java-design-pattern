package com.creational.singleton_09billpughimplementation;

class Singleton {

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

class Thread1 extends Thread {

	public void run() {
		Singleton singleton = Singleton.getSingleton();
		singleton.setData(55);
		System.out.println("First reference: " + Thread.currentThread().getName() + " " + singleton.hashCode());
		System.out.println("Singleton data value is: " + singleton.getData());
	}
}

class Thread2 extends Thread {

	public void run() {
		Singleton singleton = Singleton.getSingleton();
		System.out.println("First reference: " + Thread.currentThread().getName() + " " + singleton.hashCode());
		System.out.println("Singleton data value is: " + singleton.getData());
	}
}

public class BillPughSingletonDemo {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();
	}

}
