/*
 * Again if you miss to precede the block with "static" keyword, the block is called "constructor block" 
 * and will be executed when the class is instantiated. The constructor block will be copied into each 
 * constructor of the class. Say for example you have four parameterized constructors, then four copies 
 * of constructor blocks will be placed inside the constructor, one for each
 */

package com.java.staticKeyword;

public class ConstructorBlockExample {

	{
		System.out.println("This is first constructor block");
	}

	public ConstructorBlockExample() {
		System.out.println("This is no parameter constructor");
		System.out.println();
	}

	public ConstructorBlockExample(String param1) {
		System.out.println("This is single parameter constructor");
		System.out.println();
	}

	public ConstructorBlockExample(String param1, String param2) {
		System.out.println("This is two parameters constructor");
		System.out.println();
	}

	{
		System.out.println("This is second constructor block");
	}

	public static void main(String[] args) {
		ConstructorBlockExample constrBlockEx = new ConstructorBlockExample();
		ConstructorBlockExample constrBlockEx1 = new ConstructorBlockExample(
				"param1");
		ConstructorBlockExample constrBlockEx2 = new ConstructorBlockExample(
				"param1", "param2");
	}
}