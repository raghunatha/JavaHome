package com.java.polymorphism;

public class Square extends Shape {

	private int length;
	
	//Implementing the abstract method in Shape class
	@Override
	public double calculateArea() {
		
		return this.length*this.length;
	}
	
	//Parameterized constructor
	public Square(int length) {
	this.length=length;
	}

}
