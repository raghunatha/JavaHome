package com.java.constructors5;

public class SuperClass {

	public SuperClass(){
		System.out.println("In super class default constructor");
	}
	
	public SuperClass(int arg1){
		System.out.println("In super class parameterized constructor with 1 argument");
	}
	
	public SuperClass(int arg1, int arg2){
		System.out.println("In super class parameterized constructor with 2 arguments");
	}
}
