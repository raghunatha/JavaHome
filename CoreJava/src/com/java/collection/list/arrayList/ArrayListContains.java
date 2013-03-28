package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContains {

	public static void main(String[] args) {

		// create object of ArrayList
		List list = new ArrayList();

		// add elements to Array list object
		
		list.add(5);
		int x = (int)list.get(0);
		
		list.add(new Integer("1"));
		list.add(new Integer("2"));
		list.add(new Integer("3"));
		//list.add("raghu");
		
		 /*
	      Use get method of Java ArrayList class to display elements of ArrayList.
	      Object get(int index) returns and element at the specified index in
	      the ArrayList    
	    */
	    System.out.println("Getting elements of ArrayList");
	    System.out.println(list.get(0));
	    System.out.println(list.get(1));
	    System.out.println(list.get(2));

		/*
		 * To check whether a particular value exists in Array list use boolean
		 * contains(Object value) method of ArrayList class. It returns true if
		 * the ArrayList contains the value, otherwise false.
		 */
		boolean blnExists = list.contains(new Integer("3"));
		System.out.println("3 exists in ArrayList ? : " + blnExists);
		
		boolean blnStrExist = list.contains("3");
		System.out.println("3 exists in ArrayList ? : " + blnStrExist);
		
		boolean blnExist = list.contains(3);
		System.out.println("3 exists in ArrayList ? : " + blnExist);
		
		boolean blnStringExists = list.contains("raghu");
		System.out.println("raghu word exists in ArrayList ? : " + blnStringExists);
		
		boolean blnStringExist = list.contains("Raghu");
		System.out.println("Raghu word exists in ArrayList ? : " + blnStringExist);
		
		boolean blnNewStringExist = list.contains(new String("raghu"));
		System.out.println("raghu word exists in ArrayList ? : " + blnNewStringExist);

	}
}
