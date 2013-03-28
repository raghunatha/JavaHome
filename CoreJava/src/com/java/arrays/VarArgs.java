package com.java.arrays;

public class VarArgs {

	public static void main(String[] args) {
		
		int[] array_test = new int[2];
		array_test[0]=2;
		array_test[1]=8;		
		
		int[] array_newTest = new int[3];
		array_newTest[0]=2;
		array_newTest[1]=8;
		array_newTest[2]=7;
		
		int sumOfTwoNumbers = addNumbers(array_test);
		System.out.println("sum of two numbers : " + sumOfTwoNumbers);
		
		int sumOfThreeNumbers = addNumbers(array_newTest);
		System.out.println("sum of three numbers : " + sumOfThreeNumbers);
	}
	
	private static int addNumbers(int... args){
		int sumOfAllNumbers = 0;
		for (int i = 0; i < args.length; i++) {
			sumOfAllNumbers = sumOfAllNumbers + args[i];
		}
		return sumOfAllNumbers;
	}
}
