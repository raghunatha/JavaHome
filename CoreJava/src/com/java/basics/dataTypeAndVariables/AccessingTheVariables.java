/*
 * Accessing the values of the variables
 */

/**
 * @author raghu natha reddy S
 */
package com.java.basics.dataTypeAndVariables;

public class AccessingTheVariables {
	static int staticVariable;
	int nonStaticVariable;
	public static void main(String args[]){
		
		int unInitializedVariable; // U cannot use a local variable with out assigning a value to it
		//The local variable unInitializedVariable may not have been initialized
        //System.out.println("The value of unInitializedVariable is = "+ unInitializedVariable);
		
		System.out.println("The value of Static variable is : " + staticVariable);
		
		//cannot make a static reference to the non-static field nonStaticVariable
		//System.out.println("The value of non Static variable is : " + nonStaticVariable);
	}

}
