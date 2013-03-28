package com.java.method;

public class TestVariableArguments {
	public static void main(String args[]){
		int num1 = 5, num2 = 4;
		VariableArguments v1 = new VariableArguments();
		System.out.println("The sum of 2 numbers = " + v1.sumOfTwoNumbers(num1, num2));
		
		int num3 = 2, num4 = 3, num5 = 1;
		//The arguments to the method "sumOfNNumbers" in the VariableArguments class can vary
		System.out.println("The sum of all the numbers = " + v1.sumOfNNumbers(num1, num2, num3, num4, num5));
	}

}
