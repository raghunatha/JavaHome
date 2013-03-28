/*
 * doWhile loop first executes the statements in the loop and then checks the conditions
 */
package com.java.basics.conditionsAndLoops;

public class doWhile {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 3);
	}
}
