/*
 * Passing variable number of arguments to a method
 */

/**
 * @author raghu natha reddy S
 */
package com.java.method;

public class VariableArguments {
	
	public int sumOfNNumbers(int... numbersArray){
		int lenght = numbersArray.length;
		int sumOfNumbers = 0;
		for(int num : numbersArray)
			sumOfNumbers += num;
		return sumOfNumbers;
	}
	
	public int sumOfTwoNumbers(int num1, int num2){		
		int sumOfTwoNumbers = 0;
		sumOfTwoNumbers = num1 + num2;
		return sumOfTwoNumbers;
	}
}
