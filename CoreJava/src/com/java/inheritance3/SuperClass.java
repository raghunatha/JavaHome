/*
 * simple Super class
 */

/**
 * @author raghu natha reddy S
 */
package com.java.inheritance3;

public class SuperClass {

	int defaultVariable = 5;
	public int publicVariable = 10;
	private int privateVariable = 20;
	
	public void printMethod() {
		System.out.println("Call to SuperClass printMethod.");
	}
	
	private void privateMethod() {
		System.out.println("Call to SuperClass privateMethod.");
	}
	
	void defaultMethod(){
		System.out.println("Call to SuperClass defaultMethod with no access modifier.");
	}
	
	public void helloMethod(){
		System.out.println("Call to SuperClass helloMethod.");
		System.out.println("Welcome to Java");
	}
	
	
}