package com.java.basics.conditionsAndLoops;

public class SwitchStatement {
	public static void main(String[] args) {
		int i = 6;
		int j = 5;
		final int k = 4;
		switch (i) {
		case 1:
			System.out.println("One.");
			break; //Flow breaks out from the switch block
		case 2:
			System.out.println("Two.");
			break; //Flow breaks out from the switch block
		case 3:
			System.out.println("Three.");
			break; //Flow breaks out from the switch block
		//case j: //The variable "j" used for case should be made final
		//	System.out.println("Dynamic value i");
		//	break;
		case k: //Using variable "K" is valid since it is final(the value of "K" cannot be changed)
			System.out.println("K value is 4");
			break;
		default: //If the value of i is not equal to 1, 2, 3 or 4 then default block will be executed
			System.out.println("You did not enter a valid value.");
		}
	}
}
