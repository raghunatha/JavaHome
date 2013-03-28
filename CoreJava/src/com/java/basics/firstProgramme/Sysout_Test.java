/*
 * Test different combinations for main method and println() method
 */

/**
 * @author raghu natha reddy S
 */

package com.java.basics.firstProgramme;

public class Sysout_Test {
	public static void main(String args[]){		
		System.out.println("Hello World!");
		//System.out.println("Hello World!);
		//System.out.print("Hello World!");
		//System.out.print("welcome to java");
		//System.out.println("Hello World!" + "welcome to java");
	}
	
	//Cannot recognize the starting point as the parameter to the method is not expected. No error but cannot run the program
	//This is not considered as the staring point method. This is a new method with a different parameter when compared to main method 
	/*public static void main(Integer args[]){		
		System.out.println("Hello World!");
	}*/
	
	//Cannot recognize the starting point as the parameter to the method is not expected. No error but cannot run the program
	/*public static void main(){		
		System.out.println("Hello World!");
	}*/
	
	//Duplicate methods
	/*public static void main(String args[]){		
		System.out.println("Hello World!");
	}*/
	
	//Duplicate methods
	//By changing the parameter will not make a difference. 
	/*public static void main(String arguments[]){		
		System.out.println("Hello World!");
	}*/	
}
