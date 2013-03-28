package com.java.ioAndFileOperations;

import java.util.Scanner;

public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a Username : ");
		int username = scanner.nextInt();
		System.out.println("Please enter a Password : ");
		int password = scanner.nextInt();
		
		System.out.println("addition");
		System.out.println(username+password);

	}

}
