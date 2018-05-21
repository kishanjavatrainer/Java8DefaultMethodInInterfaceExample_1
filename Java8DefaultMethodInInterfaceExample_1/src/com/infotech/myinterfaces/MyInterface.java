package com.infotech.myinterfaces;

public interface MyInterface {
	public abstract int method1();

	// default method, providing default implementation
	default String displayGreeting() {
		return "Hello from MyInterface";
	}
}