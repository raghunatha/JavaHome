/*
 * Single method accepting multiple arguments
 * This feature is added in java 1.5 version
 */
package com.java.basics.conditionsAndLoops;

public class VarArgs {
	public static void main(String[] args) {
		
		add();
		add(1,2);
		add(1,2,3);
		add(5,7,9);
		add(2,3,5,8,4,1);
	}

	//below add method accepts variable arguments(ZERO or more arguments) 
	public static void add(int... args) {
		int sumOfAllNumbers = 0;
		for (int i = 0; i < args.length; i++) {
			sumOfAllNumbers = sumOfAllNumbers + args[i];
		}
		System.out.println("The sum of " + args.length
				+ " numbers passed by user is : " + sumOfAllNumbers);

	}
}
