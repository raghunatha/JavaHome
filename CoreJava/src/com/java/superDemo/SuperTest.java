package com.java.superDemo;

public class SuperTest extends ParentClass {

	public static void main(String[] args) {
		SuperTest superTest = new SuperTest();
		superTest.add(1);
	}
	
	public void add(){
		System.out.println("In add method with no arguments");
	}
	
	public void add(int arg1){
		//can call any no of methods in super class
		//super.ParentClass(); // cannot call constructor from the method
		SuperTest superTestNew = new SuperTest(); // call to parent class constructor will be made
		super.substract();
		super.multiply(1);
		super.divide(1, 2);
		System.out.println("In add method with one argument");
		super.divide(1, 2); // the super method call can be written at any point in a method unlike the super() constructor call which should always be the first line in a constructor
	}	
	
	public void add(int arg1, int arg2){
		System.out.println("In add method with two arguments");
	}
	
}
