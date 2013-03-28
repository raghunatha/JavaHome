package com.java.exceptionHandling1;

import java.io.FileNotFoundException;

public class ThrowCompileTimeException {
	static void throwOne() throws FileNotFoundException {
		System.out.println("Inside throwOne.");
		/*
		 * If a checked exception is thrown as shown below, either it must be
		 * written in method declaration throws or must be surrounded by try
		 * catch
		 */
		// throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwOne();
		} catch (FileNotFoundException e) {
			System.out.println("Exception thrown from the throwOne method");
			e.printStackTrace();
		}
	}
}
