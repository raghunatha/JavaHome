package com.java.basics.convertions;

public class ConvertToString {
	public static void main(String[] args) {
		
		int primitiveInt = 5;
		// Concatenate "primitiveInt" with an empty string; conversion is handled for you.
		String str = "" + primitiveInt;
		// The valueOf class method.
		String str_One = String.valueOf(primitiveInt);
		System.out.println("int converted to String as " + str);
		System.out.println("int converted to String as " + str_One);
		
		
		
		Integer intObj = new Integer(10);
		String str_Two = intObj.toString();
		System.out.println("Integer converted to String as " + str_Two);
		
		
	}
}
