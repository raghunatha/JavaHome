package com.java.reflection;

import java.lang.reflect.Modifier;

public class Reflection {
	public static void main(String[] args) {
		
		Class myClass = Student.class;
		//Obtaining the class name
		System.out.println("Class fully qualified  name : " + myClass.getName());
		System.out.println("Class name : " + myClass.getSimpleName());
		
		//Obtaining the Class modifier
		int modifier = myClass.getModifiers();
		System.out.println(myClass.getModifiers());
		System.out.println(Modifier.isPublic(modifier));
		
		//Obtaining the package info
		System.out.println("Class package details : " + myClass.getPackage());
		
		//Obtaining the super class info
		System.out.println("Super class details : " + myClass.getSuperclass());
		
		// In the same way we can obtain the list of interfaces implemented, methods, fields... and so on....
		// Also the methods, their parameters, and return types... and so on...
	}
}
