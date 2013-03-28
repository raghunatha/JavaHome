package com.java.method;

public class MethodDemo {


	void sayHello(){
		
		System.out.println("Hello from sayHello method");
		sayHi();
	}
	
	private void sayHi(){
		
		System.out.println("Hi from sayHi method");
	}
	
	public static int add(int numOne,int numTwo){
		
		return numOne+numTwo;
	}
	
public static String addition(String numOne,String numTwo){
		
		return numOne+numTwo;
	}
	
	
}
