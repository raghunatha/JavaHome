package com.java.inheritanceAndPolymorphism;

public class Circle extends Shape {
	double radius;

	public Circle(double rad) {
		radius = rad;
	}

	public double getArea() {
		area = 3.14 * (radius * radius);
		return (area);
	}
}
