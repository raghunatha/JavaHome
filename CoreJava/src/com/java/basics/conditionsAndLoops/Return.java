package com.java.basics.conditionsAndLoops;

public class Return {
	public static void main(String args[]){
		int num1 = 5;
		int num2 = 4;
		Return r = new Return();		
		System.out.println("The sum of num1 and num2 = " + r.sum(num1, num2));
		
		int num3 = 5;
		int num4 = 2;
		System.out.println("The difference between num3 and num4 = " + difference(num3, num4));
	}
	
	//Non static method
	int sum(int a, int b){
		//return the value to the calling method
		return a + b; //The value is returned to the method call "r.sum(num1, num2)" in the main method system.out.println() line
	}
	
	//Static method
	static int difference(int a, int b){
		return a - b; //The value is returned to the method call "difference(num3, num4)" in the main method system.out.println() line
	}
}
