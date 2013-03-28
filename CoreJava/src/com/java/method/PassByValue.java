/*
 * Passing primitive and Reference Data Types to a method
 * NOTE: Java passes object references by value
 * 
 * http://academic.regis.edu/dbahr/GeneralPages/IntroToProgramming/JavaPassByValue.htm
 */

/**
 * @author raghu natha reddy S
 */
package com.java.method;

import java.awt.Point;

public class PassByValue {
	public static void trickySwap(Point arg1, Point arg2) {
		arg1.x = 100;
		arg1.y = 200;
		Point temp = arg1;
		arg1 = arg2;
		arg2 = temp;
		//arg1.x = 300;
	}
	
	public static void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		swap(num1, num2);
		System.out.println("The value of num1 after swap = " + num1);
		System.out.println("The value of num2 after swap = " + num2);
		
		Point pnt1 = new Point(0, 0);
		Point pnt2 = new Point(0, 0);
		System.out.println("X: " + pnt1.x + " Y: " + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
		
		System.out.println(" ");
		
		trickySwap(pnt1, pnt2);		
		System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
	}
}
