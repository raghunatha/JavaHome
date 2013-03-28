/*
 * Creating an object for ClassWithSetters.java and setting the values using setters
 */

/**
 * @author raghu natha reddy S
 */
package com.java.basics.setterMethods;

public class TestClass1 {
	
	public static void main(String args[]){
		ClassWithSetters s= new ClassWithSetters();
		s.setStudent_id(1);
		s.setStudent_name("johny");
		System.out.println(s.getStudent_id());
		System.out.println(s.getStudent_name());
	}

}
