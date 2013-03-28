package com.java.basics.convertions;

public class AssigningValuesToFloat {

	public static void main(String[] args) {

		float f = 10; 
		//float f1 = 10.0; //cannot convert from double to float

		/*
		 * By default compiler reads all decimal values as double, so to
		 * differentiate between double and float use the character 'f' while
		 * assigning value to a float variable
		 */
		float f2 = 15.5f;
		double d = 15.5;
	}
}
