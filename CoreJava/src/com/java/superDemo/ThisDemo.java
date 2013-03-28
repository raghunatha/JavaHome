package com.java.superDemo;

public class ThisDemo {

	public ThisDemo(){
		System.out.println("Default constructor");
	}
	
	public ThisDemo(int arg1){
		System.out.println("Parameterized constructor with Integer argument");
	}
	
	public ThisDemo(double arg1){
		System.out.println("Parameterized constructor with Doule argument");
	}
	
	public ThisDemo(int arg1, int arg2){
		this(); // call to constructor must always be the first line in a constructor
		System.out.println("Parameterized constructor with two Integer arguments");
		this.add(); // call to a method can be at any line in the method
		// this(); //error, cannot call constructor at this line
	}
	
	public void add(){
		//this(); //constructor call can be made in a constructor only
		System.out.println("Dummy add method");
	}
	
	public static void main(String[] args) {
		ThisDemo thisDemo = new ThisDemo(1, 2);
	}
}
