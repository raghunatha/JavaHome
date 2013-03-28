package com.java.Overriding;

class Animals {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dogs extends Animals {

	public void move() {
		System.out.println("Dogs can walk and run");
	}

	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class OverridingMethods {

	public static void main(String args[]) {
		Animals a = new Animals(); // Animal reference and object
		Animals b = new Dogs(); // Animal reference but Dog object

		a.move();// runs the method in Animal class
		b.move();// Runs the method in Dog class
		//b.bark(); // The method bark is undefined for the type Animal
	}
}