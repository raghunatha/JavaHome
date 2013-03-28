package com.java.inheritanceAndPolymorphism;

public class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}

	@Override
	public double getArea() {
		area = length * width;
		return (area);
	}

}
