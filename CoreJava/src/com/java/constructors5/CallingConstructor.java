package com.java.constructors5;

public class CallingConstructor {

	public CallingConstructor(){
		System.out.println("From default constructor");
	}
	
	public CallingConstructor(int arg1){
		this(); // this means this object, calls default constructor
		//this(1, 2); //constructor call must be the first statement in a constructor
		System.out.println("From parameterized constructor");
	}
	
	public CallingConstructor(int arg1, int arg2){		
		System.out.println("From parameterized constructor with two parameters");
	}
	
	public static void main(String[] args) {
		CallingConstructor cc = new CallingConstructor(5);
	}
	
	public void add(){
		//this(); //cannot call a constructor from a method
	}
}
