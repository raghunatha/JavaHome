package com.java.exceptionHandling1;

import java.io.FileNotFoundException;

public class Throws {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		try{
		throw new ArithmeticException("demo");
		}catch(ArithmeticException e){
			throw new IllegalAccessException();
		}
	}

	public static void main(String args[]) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Illegal Access Exception thrown from throwOne method");
			System.out.println("Caught " + e);
		}
	}
	
	//print method throws 2 exceptions
	//ArrayIndexOutOfBoundsException is a run time exception which may or may-not be caught by the calling method "printer()"
	//FileNotFoundException is a compile time exception if it is declare it in throws clause then the calling method "printer()" must handle it to avoid compile time error
	public void print() throws ArrayIndexOutOfBoundsException, FileNotFoundException {
		System.out.println("Inside print method");
		throw new FileNotFoundException();
	}
	
	public void hello() {
		System.out.println("Inside hello method");
		//The below exception is a compileTime exception, so either it must be surrounded by try catch block, or it must be declared in throws clause of the method 
		//throw new FileNotFoundException();
		
		//The below exception is run time exception so the current method need not catch the exception
		//throw new ArrayIndexOutOfBoundsException();
	}
	
	public void printer(){
		System.out.println("In a printer method");
		try {
			print();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
