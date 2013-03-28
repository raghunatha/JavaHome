package com.java.staticKeyword;

public class VariableScope {

	int i =5;
	static int j =6;
	
	public static void main(String[] args) {
		VariableScope t1 = new VariableScope();
		System.out.println("t1.i : " + t1.i);
		System.out.println("t1.j : " + t1.j);
		System.out.println();
		
		VariableScope t2 = new VariableScope();
		t2.i = 1;
		t2.j = 2;
		System.out.println("The values of t1 and t2 are...");
		System.out.println("t1.i : " + t1.i); // 5
		System.out.println("t1.j : " + t1.j); // 2 --> static
		
		System.out.println("t2.i : " + t2.i); // 1
		System.out.println("t2.j : " + t2.j); // 2 --> static
		
		VariableScope t3 = new VariableScope();
		t3.i=7;
		t3.j=8;
		
		System.out.println();
		System.out.println("The values of t1, t2 and t3 are...");
		System.out.println("t1.i : " + t1.i); // 5
		System.out.println("t1.j : " + t1.j); // 8 --> static
		
		System.out.println("t2.i : " + t2.i); // 1
		System.out.println("t2.j : " + t2.j); // 8 --> static
		
		System.out.println("t3.i : " + t3.i); // 7
		System.out.println("t3.j : " + t3.j); // 8 --> static
		
	}
	
}
