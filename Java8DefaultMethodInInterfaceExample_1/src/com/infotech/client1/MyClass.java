package com.infotech.client1;

import com.infotech.myinterfaces.MyInterface;

public class MyClass implements MyInterface {
	// provides implementation for the non-default method of the interface
	@Override
	public int method1() {
		return 20;
	}

	public static void main(String[] args) {
		MyInterface myInterface = new MyClass();
		System.out.println("Value: " + myInterface.method1());
		
		// Calls the default method provided by interface itself
		System.out.println("Greeting: " + myInterface.displayGreeting());
	}
}