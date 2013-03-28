/*
 * Declaring and using constants in a class
 * Can the value of constant variable be modified after first assignment
 */

/**
 * @author raghu natha reddy S
 */
package com.java.basics.dataTypeAndVariables;

public class Constants {

	//The blank final field CLASS_CONSTANT_VARIABLE may not have been initialized
	//static final int CLASS_CONSTANT_VARIABLE;	
	//static final int CLASS_CONSTANT_VARIABLE = 10;
	
	public static void main(String args[]){
		
		final int CONSTANT_VARIABLE;
		CONSTANT_VARIABLE=10;
		
		//The final local variable CONSTANT_VARIABLE may already have been assigned
		//CONSTANT_VARIABLE =20;		
		
		System.out.println("The value of constant variable is : " + CONSTANT_VARIABLE);
	}
}
