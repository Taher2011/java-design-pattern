package com.creational.singleton_08preventsingletonfromserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable {

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

	protected Object readResolve() {
		return singleton;

	}

}

public class PreventSingletonFromSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Singleton singleton1 = Singleton.getSingleton();
		System.out.println(singleton1.hashCode());

		Singleton singleton2 = Singleton.getSingleton();
		System.out.println(singleton2.hashCode());

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(singleton2);

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton singleton3 = (Singleton) ois.readObject();
		System.out.println(singleton3.hashCode());

	}

}
