package com.java.inheritance2;

public class Child extends Parent {

	//Overriding the parent class method in the child and giving our own functionality in child class method
	@Override
	public void print() {
		super.print(); // calling the parent class method, before executing the child method
		System.out.println("Child");
	}

}
