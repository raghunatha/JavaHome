package com.java.basics.conditionsAndLoops;

public class While {
	public static void main(String[] args) {
		int i = 0;
		while (i < 3) {
			System.out.println(i);
			i++;
		}

		int k = 0;
		while (true) {
			System.out.println(k);
			k++;
			if (k > 2) {
				break;
			}
		}
	}

}
