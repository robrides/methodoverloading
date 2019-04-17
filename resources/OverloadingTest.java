package com.skilldistillery.presentationmethodoverloading.examples;

public class OverloadingTest {

	public static void main(String[] args) {
		Integer integerObject = new Integer(2_000);
		int i = 200;
		overloadedMethod(i);
		overloadedMethod(integerObject);

		Short shortObject = new Short((short) 127);
		short shorty = 1;
		overloadedMethod(shortObject);
		overloadedMethod(shorty);

		Long longObject = new Long(10_000);
		long longPrim = 1_000;
		overloadedMethod(longPrim);
		overloadedMethod(longObject);

	}

	public static void overloadedMethod(int i) {
		System.out.println("Overloaded add method, primitive type int: " + i);
	}

	public static void overloadedMethod(short s) {
		System.out.println("Overloaded add method, primitive type short: " + s);
	}

	public static void overloadedMethod(float f) {
		System.out.println("Overloaded add method, primitive type float: " + f);
	}

	public static void overloadedMethod(Integer i) {
		System.out.println("Overloaded add method, Reference type Integer: " + i);
	}

	public static void overloadedMethod(Short s) {
		System.out.println("Overloaded add method, Reference type Short: " + s);
	}
	
	public static void overloadedMethod(Long l) {
		System.out.println("Overloaded add method, Reference type Long: " + l);
	}
	
	public static void overloadedMethod(Object o) {
		System.out.println("Overloaded add method, Reference type Long: " + o);
	}
}
