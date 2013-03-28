/*
 * String comparison is different from Object comparison  
 */

package com.java.hashCodeAndEquals;

public class EqualsTest {
public static void main(String[] args) {
	
	String str = new String("Hello");
	String str1 = new String("Hello");
	
	if(str.equals(str1)){
		System.out.println("The Strings are equal");
	}else{
		System.out.println("The Strings are not equal");
	}
	
	Student s1 = new Student();
	s1.setStudentId(1);
	s1.setStudentName("Raghu");
	
	Student s2 = new Student();
	s2.setStudentId(1);
	s2.setStudentName("Raghu");
	
	if(s1.equals(s2)){
		System.out.println("The two student objects are equal");
	}else{
		System.out.println("The two student objects are not equal");
	}
}
}
