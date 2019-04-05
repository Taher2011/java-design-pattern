package com.creational.singleton_06preventsingletonfromcloning;

class Singleton implements Cloneable {

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

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void setData(int myData) {
		data = myData;
	}

	public int getData() {
		return data;
	}
}

public class PreventSingletonFromCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singleton1 = Singleton.getSingleton();
		singleton1.setData(55);
		System.out.println("First reference: " + singleton1.hashCode());
		System.out.println("Singleton data value is: " + singleton1.getData());

		System.out.println();

		Singleton singleton2 = (Singleton) singleton1.clone();
		System.out.println("Second reference: " + singleton2.hashCode());
		System.out.println("Singleton data value is: " + singleton2.getData());

	}

}
