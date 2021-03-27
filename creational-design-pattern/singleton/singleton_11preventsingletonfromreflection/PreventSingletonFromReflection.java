package singleton_11preventsingletonfromreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton {

	private int data = 0;

	private static Singleton singleton;

	private Singleton() {
		if (singleton != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}
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

public class PreventSingletonFromReflection {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Singleton singleton1 = Singleton.getSingleton();
		singleton1.setData(55);
		System.out.println("First reference: " + singleton1.hashCode());
		System.out.println("Singleton data value is: " + singleton1.getData());

		System.out.println();

		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			Singleton singleton2 = (Singleton) constructor.newInstance();
			singleton2.setData(55);
			System.out.println("Second reference: " + singleton2.hashCode());
			System.out.println("Singleton data value is: " + singleton2.getData());
		}
	}

}
