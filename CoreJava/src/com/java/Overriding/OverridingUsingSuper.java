package com.java.Overriding;

class AnimalA {

	public void move() {
		System.out.println("Animals can move");
	}
}

class DogD extends AnimalA {

	public void move() {
		super.move(); // invokes the super class method
		System.out.println("Dogs can walk and run");
	}

}

public class OverridingUsingSuper {

	public static void main(String args[]) {

		AnimalA b = new DogD(); // Animal reference but Dog object
		b.move();// Runs the method in Dog class

	}
}