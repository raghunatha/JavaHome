package com.java.interfaces.variables;

public interface VariableTest {
	
	//public int x = 1; // Looks non-static and non-final, but isn't!
	//int x = 1; // Looks default, non-final, non-static, but isn't!
	//static int x = 1; // Doesn't show final or public
	//final int x = 1; // Doesn't show static or public
	//public static int x = 1; // Doesn't show final
	//public final int x = 1; // Doesn't show static
	//static final int x =1; // Doesn't show public 
	//static final int x; //An int static variable declaration in a class will default it to '0', but not in interface
	//final static int x=1;
	//public static final int x = 1;
	
	
	/*IMPORTANT NOTE: Interface variables are static because Java interfaces 
	 * cannot be instantiated in their own right; the value of the variable must be 
	 * assigned in a static context in which no instance exists. 
	 * The final modifier ensures the value assigned to the interface variable 
	 * is a true constant that cannot be re-assigned by program code
	 */ 

}
