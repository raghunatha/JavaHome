package com.java.exceptionHandling3;

public class testClock {
	public static void main(String args[]) {
		try {
			Clock clock = new Clock(1, 2, -3);
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal Argument Exception block caught: " + e);
		}catch (UserDefinedException e) { //catching user defined exception
			System.out.println("User Defined Exception block caught: " + e.getLocalizedMessage());
		} catch (Exception e) {
			System.out.println("Exception block caught: " + e.getMessage());
		}
	}
}
