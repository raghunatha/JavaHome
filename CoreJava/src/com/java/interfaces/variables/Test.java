package com.java.interfaces.variables;

class A {
	int number = 5;
}

interface B {	
	int number = 5;
}

public class Test {
	public static void main(String args[]) {
		A a1, a2, a3;
		B b1, b2, b3;

		// They are Null
		b1 = null;
		b2 = null;
		b3 = null;

		a1 = new A();
		a2 = new A();
		a3 = new A();

		a1.number = 1;
		a2.number = 2;
		a3.number = 3;

		// Obviously the objects of A are independent of each other
		System.out.println("Changing with the Object....");
		System.out.println("A1 " + a1.number);
		System.out.println("A2 " + a2.number);
		System.out.println("A3 " + a3.number);

		System.out.println("No concept of Object, They are Null remember!!");
		System.out.println("B1 " + b1.number);
		System.out.println("B2 " + b2.number);
		System.out.println("B3 " + b3.number);

		System.out.println("Actually using references is not required at all....");
		System.out.println("B " + B.number);

		// NOT allowed: since we do not refer them via objects...
		// B.number=20;
		// NOTE: Interface variables are static because Java interfaces cannot be instantiated in their own right
	}
}