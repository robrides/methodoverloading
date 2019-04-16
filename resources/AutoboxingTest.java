package com.skilldistillery.presentationmethodoverloading.examples;

public class AutoboxingTest {

	public static void main(String[] args) {

		Integer integerObject = new Integer(2_000);
		int i = 100;
		integerObject = i; // Autoboxing of primitive int to wrapper Integer
		System.out.println("Value of integerObject after autoboxing of int: " + integerObject);

		i = 200;
		integerObject = Integer.valueOf(i); // Manual boxing of primitive int to wrapper Integer
		System.out.println("Manual boxing of primitive int with explicit .valueOf(): " + integerObject);

		Long longObject = new Long(10_000);
		long longPrim = 1_000;
		longObject = longPrim; // Autoboxing of primitive long to wrapper Long
		System.out.println("Value of longObject after autoboxing of long: " + longObject + " Class: "
				+ longObject.getClass().getSimpleName());
		longPrim = i; // This is promotion from int to long, not autoboxing
		System.out.println("Value of longPrim int promotion: " + longPrim);

	}
}
