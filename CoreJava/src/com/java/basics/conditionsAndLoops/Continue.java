package com.java.basics.conditionsAndLoops;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				//Continue skips the below lines of code in the for loop if the condition in the if condition is satisfied
				continue;
			}
			System.out.println(i);
		}
	}
}
