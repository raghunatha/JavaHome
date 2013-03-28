package com.java.ioAndFileOperations;

import java.io.DataInputStream;
import java.io.IOException;

public class ReadFromConsole {
	public static void main(String[] args) throws NumberFormatException, IOException {
		DataInputStream dataInputStream = new DataInputStream(System.in);
		System.out.println("Please enter a value");
		int valueOne = Integer.parseInt(dataInputStream.readLine());
		System.out.println("Entered value is : " + valueOne);
		
		System.out.println("Please enter a value");
		String message = dataInputStream.readLine();
		System.out.println(message);
	}
}
