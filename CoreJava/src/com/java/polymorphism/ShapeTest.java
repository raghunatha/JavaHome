package com.java.polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List shapesList = new ArrayList();
		
		Shape polyShape = new Rectangle(1,2);
		//polyShape is a variable with the ability to reference objects of different types
		shapesList.add(polyShape);
		
		polyShape = new Triangle(2, 3);
		shapesList.add(polyShape);
		
		polyShape = new Square(5);
		shapesList.add(polyShape);
		
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.printArea(shapesList);
	}

	private void printArea(List shapes){
		Iterator itr = shapes.iterator();
		while(itr.hasNext()){
			Shape shape = (Shape)itr.next();	
			System.out.println("The name of the shape is : " + shape.getClass().getSimpleName());
			//Depending on what the shape, appropriate calculateArea() is called 
			System.out.println("The area of "+ shape.getClass().getSimpleName() + " is = " +shape.calculateArea());
			System.out.println();
		}
	}	
}
