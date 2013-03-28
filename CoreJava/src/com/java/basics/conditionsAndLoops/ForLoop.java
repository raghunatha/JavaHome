package com.java.basics.conditionsAndLoops;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " ");
		}
		
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		int j = 0;
		for (; j < 3; j++) {
			System.out.println(j);
		}

		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		
		int k = 0;
		for (; k < 3;) {
			System.out.println(k);
			k++;
		}

		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		
		int m = 0;
		for (;;) {
			System.out.println(m);
			m++;
			if (m > 4) {
				break;
			}
		}
		
		System.out.println("");
		System.out.println("-------------------");
		System.out.println("");
		
		 int limit = 10;
		    int sum = 0;
		    for (int i = 1, l = 0; i <= limit; i++, l++) {
		    	System.out.println("i = " + i);
		    	System.out.println("l = " + l);
		      sum += i * l;
		    }
		    System.out.println(sum);
		    
		 //infinite loop, as there is no initial value or condition to check
			/*for (;;) {
				System.out.println("hello");
			}*/
	}
}
