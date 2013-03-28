package com.java.constructors5;

public class CallingSuperClassConstructor extends SuperClass {

	public CallingSuperClassConstructor() {		
		//parent class default constructor will be called first
		System.out.println("In sub class default constructor");
		System.out.println();
	}
	
	public CallingSuperClassConstructor(int arg1) {
		//parent class default constructor will be called first if the below call to super(1,2) is commented
		//super(1, 2); // explicit call to super class parameterized constructor(will not call default super class constructor if uncommented
		//super(1); // cannot write 2 super statement calls in a constructor. Super must always be the first call
		System.out.println("In sub class parameterised constructor");
		System.out.println();
	}
	
	public CallingSuperClassConstructor(int arg1, int arg2) {
		//cannot use this and super at the same time in a constructor, since both must always be the first statement in a constructor
		//this();
		//super(1);
		System.out.println("In sub class parameterised constructor with 2 parameters");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		CallingSuperClassConstructor cscc = new CallingSuperClassConstructor();
		CallingSuperClassConstructor csc = new CallingSuperClassConstructor(2);
	}
}
