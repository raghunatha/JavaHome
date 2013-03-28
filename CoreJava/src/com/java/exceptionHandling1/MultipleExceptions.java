package com.java.exceptionHandling1;

import java.io.FileNotFoundException;

public class MultipleExceptions {
public static void main(String[] args) {
	
	Throws t = new Throws();
	try {
		t.throwOne();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//Below is the example of a single catch block which can catch multiple exceptions
		try {
			t.print();
		} catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
