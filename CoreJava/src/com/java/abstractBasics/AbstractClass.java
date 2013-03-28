/*
 * Example of an abstract class
 */

package com.java.abstractBasics;

//A class is abstract if it has ZERO or more abstract methods
public abstract class AbstractClass {
	
	//abstract method has no implementation
	public abstract void testDemo();
	
	public abstract int testSumOfNumbers();
	
	//Concrete method has method body or implementation
	public String testReturnName(String name){
		System.out.println("This method returns a String");
		return "simple String";
	}
	
	public double testReturnSalary(double salary){
		System.out.println("This method returns salary");
		return 1500;
	}

	public float testReturnBillAmount(float amount){
		System.out.println("This method returns bill Amount");
		return 1500;
		//return 1500.0
		//return 1500.0f
	}
}
