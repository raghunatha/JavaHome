package com.java.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public CheckedExceptions() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		File file = new File("my/file/path");
	    try {
	    	//Compiler checks for this exception at compile time only
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
