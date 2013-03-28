/*
 * While declaring exceptions always declare the sub class exceptions first followed by super class exceptions
 * Exception is the parent class of arithmeticExceptio, so ArithmeticException should be declared first followed by Exception block
 */
package com.java.exceptionHandling;

public class ExceptionHierarchy {
	public static void main(String args[]) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} /*
		 * catch (ArithmeticException e) { System.out.println("Divide by 0: " +
		 * e); } catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Array index oob: " + e); }
		 */
		System.out.println("After try/catch blocks.");
		System.out
				.println("Executed even after exception because exception is caught in catch block");
	}
}
