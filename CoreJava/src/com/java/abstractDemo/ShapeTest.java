package com.java.abstractDemo;

public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//A parent class reference variable pointing to sub class object 
		ShapeTest test = new ShapeTest();
		
		Triangle triangle = new Triangle(2, 3);
		//Calculating the area buy directly calling the "calculateArea" method 
		System.out.println("Area of Triangle is = " +triangle.calculateArea());
		//Calculating the area by calling the printArea and passing an object of type "Shape"
		test.printArea(triangle);
		
		Rectangle rectangle = new Rectangle(4, 5);
		System.out.println("Area of Rectangle is = " +rectangle.calculateArea());
		test.printArea(rectangle);
	}

	//The printArea method takes an object of type shape
	private void printArea(Shape shape){
		System.out.println("The area of "+ shape.getClass().getSimpleName() + " is = " +shape.calculateArea());
	}
	
}
