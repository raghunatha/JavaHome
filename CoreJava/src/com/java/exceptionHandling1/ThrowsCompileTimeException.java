package com.java.exceptionHandling1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsCompileTimeException {
	static void throwOne() throws FileNotFoundException {
		System.out.println("Inside throwOne.");		
		File file = new File("my/file/path");
	    //Compiler checks for this exception at compile time only
		//If thorws clause is removed then the below piece of code will show a compile time error
		FileInputStream fis = new FileInputStream(file);
	}

	public static void main(String args[]) {
		try {
			throwOne();
		} catch (FileNotFoundException e) {
			System.out.println("Exception thrown from throwOne method");
			e.printStackTrace();
		}
	}
}
