/*
 * Creating, Initializing and Accessing an Array
 */

/**
 * @author raghu natha reddy S
 */
package com.java.arrays;

public class CreatingAndInitilizing {
	public static void main(String args[]) {
		
		int[] anArray = new int[10];//Declaring an int array of size 10
		anArray[0] = 100; // initialize first element 
		anArray[1] = 200; // initialize second element 
		anArray[2] = 300; // initialize third element		
		System.out.println("Accessing the first element in the array anArray " + anArray[0] );
		System.out.println("Accessing the fourth element in the array anArray " + anArray[3] );
		//System.out.println("Accessing the elventh element in the array anArray " + anArray[10] ); //java.lang.ArrayIndexOutOfBoundsException: 10		

		int[] intArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		System.out.println("Accessing the first element in the array intArray " + intArray[0] );
		System.out.println("Accessing the fourth element in the array intArray " + intArray[3] );

		String[][] names = { {"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"} };
		System.out.println("Accessing the first name in the first row in the array names " + names[0][0]);
		System.out.println("Accessing the first name in the second row in the array names " + names[1][0]);
		
		//More examples
		int IntArray[] = {1, 2, 3, 4};
		char charArray[] = {'a', 'b', 'c'};
		Object obj[] = {new Employee(), new Employee()};
		String pets[] = {"cats", "dogs"};
		
	}
}
