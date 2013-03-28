package com.java.ioAndFileOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsoleEfficiently {
	public static void main(String[] args) throws IOException {
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a message");
		String message = bis.readLine();
		System.out.println(message);
		
	}

}
