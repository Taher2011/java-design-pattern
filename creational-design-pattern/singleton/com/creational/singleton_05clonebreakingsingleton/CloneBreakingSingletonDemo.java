package com.creational.singleton_05clonebreakingsingleton;

class Singleton implements Cloneable {

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

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}

public class CloneBreakingSingletonDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singleton1 = Singleton.getSingleton();
		System.out.println(singleton1.hashCode());

		Singleton singleton2 = (Singleton) singleton1.clone();
		System.out.println(singleton2.hashCode());

	}

}
