package com.java.abstractDemo;

public class Triangle extends Shape {

	private int length;
	private int height;
	
	//Implementing the abstract method in Shape class
	@Override
	public double calculateArea() {
		
		return 0.5*length*height;
	}

	//Parameterized constructor
	public Triangle(int length,int height) {
		this.length=length;
		this.height=height;
	}
}
