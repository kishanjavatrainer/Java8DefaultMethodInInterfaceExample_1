package com.infotech.client2;

import com.infotech.myinterfaces.MyInterface;

public class MyClass implements MyInterface {
	// provides implementation for the non-default method of the interface
	@Override
	public int method1() {
		return 20;
	}

	// Overriding the default method of MyInterface
	public String displayGreeting() {
		return "Hello from MyClass";
	}

	public static void main(String[] args) {
		MyInterface myInterface = new MyClass();
		System.out.println("Value: " + myInterface.method1());

		// Calls the default method provided by interface itself
		System.out.println("Greeting: " + myInterface.displayGreeting());
	}
}