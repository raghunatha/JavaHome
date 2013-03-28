package com.java.basics.conditionsAndLoops;

public class IfStatement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 10, i = 5, j = 6;

		if (a > 3) {
			System.out.println("If block output");
		} else if (a > 5) {
			System.out.println("Else if block output");
		} else {
			System.out.println("Else block output");
		}

		
		if ((i == 5 || j == 5) || (i == 6 || j == 6)) {
			System.out.println("Match found in || condition");
		}

		if ((i == 5 && j == 5) || (i == 6 && j == 6)) {
			System.out.println("Match found in && condition");
		} else {
			System.out.println("Match not found in && condition");
		}

		//Cannot convert from int to boolean
		/*if (1) {
			System.out.println("value is true");
		}*/
		
		if (true) {
			//The below statement is always executed
			System.out.println("value is true");
		}

		if (false) {
			//The flow never comes in to the loop
			System.out.println("value is false");
		}

		// nested conditions
		if (a > 3) {
			if (i < a) {
				System.out.println("a is greater than i");
			} else {
				System.out.println("i is greater than a");
			}
		} else {
			System.out.println("a is less than 3");
		}

	}
}