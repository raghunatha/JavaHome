package com.java.WrapperClass;

public class WrapperInteger {

	static int y;
	static Integer YY;
	public static void main(String[] args) {
		int x;
		Integer XX;
		
		//System.out.println("primitive value of x = " + x); // Local variable is not initialized
		//System.out.println("Value of Object XX = " + XX); // Local variable is not initialized
		System.out.println("primitive value of y = " + y); // class level variables will be initialized to their default values 
		System.out.println("Value of Object YY = " + YY); // Objects will be defaulted to null
	}
}
