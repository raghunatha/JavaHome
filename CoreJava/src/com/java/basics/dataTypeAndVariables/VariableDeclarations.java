package com.java.basics.dataTypeAndVariables;

public class VariableDeclarations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Single line comment
		// another comment

		/*
		 * this is multiple line comments
		 * You can write anything here will be
		 * ignored by the compiler
		 *  
		 * */
		
		System.out.println("This is a print line");
		System.out.println("Another print line");
		
		System.out.println();
		
		int a=10;
		int b=12;
		float f=0.0f;//Observe the declaration of the value carefully and see the difference between float valu and double value
		double d=16.5,e=14.5;
		
		char c='a';
		boolean flag = false;
		long l = 12;
		short s = 2;
		
		//Type casting double to int (data loss)
		int doubeValue =(int) d;
		
		System.out.println(doubeValue);
		
		System.out.println("Integer A value is : "+a);
		System.out.println("Integer B value is : "+b);
		System.out.println("Float f value is : "+f);
		System.out.println("Double d value is : "+d);
		System.out.println("Double e value is : "+e);
		System.out.println("Character c value is : "+c);
		System.out.println("Boolean value : "+flag);
		System.out.println("Long l value is : "+l);
		System.out.println("Short s value is : "+s);
		
		System.out.println("ADDITION OF A AND B : "+(a+b));
	}

}
