package com.java.constructor;

public class TestDefaultConstructor {
	public static void main(String args[]){
		
		//In DefaultCostructor.java if the default constructor is commented the below call will throw an error.
		//When a parameterized constructor is present java will not insert a default constructor 
		DefaultConstructor d1 = new DefaultConstructor();
		DefaultConstructor d2 = new DefaultConstructor("raghu");
	}
}
