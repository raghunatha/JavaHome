package com.java.basics.convertions;

public class MainClass {
	public static void main(String args[]) {
		byte b;
		int i = 257;
		double d = 323.142;

		System.out.println("\nConversion of int to byte.");
		b = (byte) i; //byte variable can hold values from -255 to 256 only 
		System.out.println("i and b " + i + ", " + b);

		System.out.println("\nConversion of double to int.");
		i = (int) d; //int cannot hold decimal values
		System.out.println("d and i " + d + ", " + i);

		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b " + d + ", " + b);
	}
}