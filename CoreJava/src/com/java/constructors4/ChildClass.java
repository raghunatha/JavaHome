package com.java.constructors4;

public class ChildClass extends SuperClass{

	public ChildClass() {
		System.out.println("In child class");
	}
	
	public static void main(String[] args) {
		ChildClass c2 = new ChildClass();
	}

}
