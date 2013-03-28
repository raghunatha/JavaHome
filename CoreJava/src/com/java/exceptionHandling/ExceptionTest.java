/*
 * If there are multiple exceptions in a class, then how many will be thrown and how many will be caught?
 */

package com.java.exceptionHandling;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
		try {
			int[] ints = {};
			// Accessing ints[0] will cause Array index out of bounds exception,
			// since ints array is not assigned a value
			System.out.println(ints[0]);
			//The below line will cause a divide by zero exception
			int result = 5 / 0;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println("There is an Arthematic Exception");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array out of bounds Exception encountered");
		} catch (Exception e) {
			System.out.println("There is an exception");
		} finally {
			System.out.println("I am in finally");
			throw new ArithmeticException();
		}
		}catch(ArithmeticException e11){
			System.out.println("Came here");
		}

	}

}
