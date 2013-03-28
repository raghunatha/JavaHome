package com.java.basics.convertions;

public class ConvertCommandLineArguments {
	public static void main(String[] args) {

		// this program requires two
		// arguments on the command line
		if (args.length == 2) {
			// convert strings to numbers
			float a = (Float.valueOf(args[0])).floatValue();
			float b = (Float.valueOf(args[1])).floatValue();
			
			//The above conversions can also be done in the following way
			//float a = Float.parseFloat(args[0]);
			//float b = Float.parseFloat(args[1]);

			// do some arithmetic
			System.out.println("a + b = " + (a + b));
			System.out.println("a - b = " + (a - b));
			System.out.println("a * b = " + (a * b));
			System.out.println("a / b = " + (a / b));
			System.out.println("a % b = " + (a % b));
		} else {
			System.out.println("This program "
					+ "requires two command-line arguments.");
		}
	}
}
