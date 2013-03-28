package com.java.WrapperClass;

public class WrapperManipulations {

	public static void main(String[] args) {
		int x = 5;
		Integer XX = 6;
		System.out.println("The value of x = " + x);
		System.out.println("The value of XX = " + XX);
		
		int y;
		Integer YY = 1; // Autoboxing --> Automatic conversion of primitive types to their object equivalents
		y = YY; // Auto-unboxing --> wrapper types are automatically converted into their primitive equivalents
		System.out.println("The value of y = " + y);
		System.out.println("The value of YY = " + YY);
		
		int z;
		Double ZZ = 15.6;
		z = ZZ.intValue(); // Returns the value of this Double to int
		System.out.println("The value of z = " + z);
		System.out.println("The value of ZZ = " + ZZ);
		
	}
}
