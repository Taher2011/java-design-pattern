package com.creational.singleton_03synchronizedkeyword;

class Singleton {

	private int data = 0;

	private static Singleton singleton;

	private Singleton() {
		super();
	}

	public static synchronized Singleton getSingleton() {
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

public class PreventSingletonFromSynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.nanoTime();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("totalTime " + totalTime);
	}

}
