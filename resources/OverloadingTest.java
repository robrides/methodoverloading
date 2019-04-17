package com.skilldistillery.presentationmethodoverloading.examples;

public class OverloadingTest {

	public static void main(String[] args) {
		Integer integerObject = new Integer(2_000);
		int i = 100;
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

	public static void overloadedMethod(short i) {
		System.out.println("Overloaded add method, primitive type short: " + i);
	}

	public static void overloadedMethod(float i) {
		System.out.println("Overloaded add method, primitive type float: " + i);
	}

	public static void overloadedMethod(Integer i) {
		System.out.println("Overloaded add method, Reference type Integer: " + i);
	}

	public static void overloadedMethod(Long i) {
		System.out.println("Overloaded add method, Reference type Long: " + i);
	}
}
