package com.java.inheritanceAndPolymorphism;

public class AreaCalculator {
	public static void main(String[] args) {
		System.out.print("The area is : ");
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4,5);
		System.out.println(getArea(circle) + getArea(rectangle));
	}
	
	static double getArea(Shape shape){
		return shape.getArea();
	}
}
