package com.creational.singleton_06preventsingletonfromcloning;

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
		return super.clone();
	}

}

public class PreventSingletonFromCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singleton1 = Singleton.getSingleton();
		System.out.println(singleton1.hashCode());

		Singleton singleton2 = (Singleton) singleton1.clone();
		System.out.println(singleton2.hashCode());

	}

}
