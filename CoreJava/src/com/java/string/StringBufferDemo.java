package com.java.string;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer strBuffer = new StringBuffer("Hello");
		
		//The below initialization is error. Cannot convert string to stringbuffer
		/*StringBuffer sb = "Hello";
		StringBuffer strBuffer = "Hello";
		*/
		String s1;
		
		System.out.println("Comparing String Buffer objects \n" );
		System.out.println("sb.equals(strBuffer) : " + sb.equals(strBuffer));
		//To compare String buffer objects, first convert them to String using the toString method 
		System.out.println("sb.toString().equals(strBuffer.toString()) : " + sb.toString().equals(strBuffer.toString()));
		
	}
}
