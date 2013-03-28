package com.java.constructor;

public class NoConstructorCall {

	public static void main(String[] args) {
		NoConstructor nc;
		//System.out.println(nc.getGender()); // The local variable nc is not initialised
		
		NoConstructor noConstructor = new NoConstructor();
		System.out.println("The default value for name = " + noConstructor.getName());
		System.out.println("The default value for the number = " + noConstructor.getNumber());
		System.out.println("The default value for the gender = " + noConstructor.getGender());
	}
}
