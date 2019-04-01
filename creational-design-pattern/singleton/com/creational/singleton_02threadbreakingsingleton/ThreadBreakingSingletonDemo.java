package com.creational.singleton_02threadbreakingsingleton;

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

class Thread1 extends Thread {

	public void run() {
		Singleton singleton = Singleton.getSingleton();
		System.out.println(Thread.currentThread().getName() + " "
				+ singleton.hashCode());
	}
}

class Thread2 extends Thread {

	public void run() {
		Singleton singleton = Singleton.getSingleton();
		System.out.println(Thread.currentThread().getName() + " "
				+ singleton.hashCode());
	}
}

public class ThreadBreakingSingletonDemo {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();
	}

}
