package com.java.collection.set;

import java.util.HashSet;

public class Contains {

	public static void main(String[] args) {

		// create object of HashSet
		HashSet hSet = new HashSet();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
		hSet.add("raghu");

		/*
		 * To check whether a particular value exists in HashSet use boolean
		 * contains(Object value) method of HashSet class. It returns true if
		 * the HashSet contains the value, otherwise false.
		 */
		boolean blnExists = hSet.contains(new Integer("3"));
		System.out.println("3 exists in HashSet ? : " + blnExists);
		
		boolean blnExist = hSet.contains(3);
		System.out.println("3 exists in HashSet ? : " + blnExist);
		
		boolean blnStringExists = hSet.contains("raghu");
		System.out.println("raghu word exists in HashSet ? : " + blnStringExists);
		
		boolean blnStringExist = hSet.contains("Raghu");
		System.out.println("Raghu word exists in HashSet ? : " + blnStringExist);
		
		boolean blnNewStringExist = hSet.contains(new String("raghu"));
		System.out.println("raghu word exists in HashSet ? : " + blnNewStringExist);

	}
}