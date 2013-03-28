package com.java.constructor;

public class DefaultConstructor {
	
	//Overloaded Constructors
	//Overloading a constructor means typing in multiple versions of the constructor, each	having a different argument list
	DefaultConstructor(){
		System.out.println("Default constructor");
	}
	
	DefaultConstructor(String name){
		System.out.println("The value passed to the parameterized constructor is : " + name);
	}
	
	void DefaultConstructor(){
		System.out.println("Not a constructor, its a method");
	}
}
