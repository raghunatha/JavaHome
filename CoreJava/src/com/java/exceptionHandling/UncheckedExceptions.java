package com.java.exceptionHandling;


public class UncheckedExceptions {
	public static void main(String args[]) {
		int d, a;

		try {
			d = 0;
			a = 42 / d;
			//The below code in the try block will not be executed if an exception occurs at line 9
			System.out.println("This will not be printed.");
		} catch (ArithmeticException e) { //
			System.out.println("Division by zero.");
		}
		System.out.println("After catch statement.");		
	}
}
