package com.java.polymorphism;

public class Rectangle extends Shape {

	private int length;
	private int breadth;
	
	//Implementing the abstract method in Shape class
	@Override
	public double calculateArea() {
		
		return length*breadth;
	}
	
	//Parameterized constructor
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

}
