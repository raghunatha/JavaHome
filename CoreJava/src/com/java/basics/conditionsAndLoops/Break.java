package com.java.basics.conditionsAndLoops;

public class Break {
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			System.out.println(i);
			i++;
			if (i > 3) {
				//Break is used to break out from the while loop if the condition in the if condition is satisfied
				break;
			}
		}
		int count = 50;
		for (int j = 1; j < count; j++) {
			if (count % j == 0) {
				System.out.println("Breaking!!");
				//Break is used to break out from the for loop if the condition in the if condition is satisfied
				break;
			}
		}
	}

}
