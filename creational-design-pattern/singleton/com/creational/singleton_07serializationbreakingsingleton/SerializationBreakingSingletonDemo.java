package com.creational.singleton_07serializationbreakingsingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable {

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

public class SerializationBreakingSingletonDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Singleton singleton1 = Singleton.getSingleton();
		singleton1.setData(55);
		System.out.println("First reference: " + singleton1.hashCode());
		System.out.println("Singleton data value is: " + singleton1.getData());

		System.out.println();
		
		Singleton singleton2 = Singleton.getSingleton();
		System.out.println("Second reference: " + singleton2.hashCode());
		System.out.println("Singleton data value is: " + singleton2.getData());

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(singleton2);

		System.out.println();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton singleton3 = (Singleton) ois.readObject();
		System.out.println("Thrid reference: " + singleton3.hashCode());
		System.out.println("Singleton data value is: " + singleton3.getData());

	}

}
