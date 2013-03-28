package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexOf {

	public static void main(String[] args) {
		List arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		/*
		 * To add an element at the specified index of ArrayList use void
		 * add(int index, Object obj) method. This method inserts the specified
		 * element at the specified index in the ArrayList.
		 */
		arrayList.add(1, "INSERTED ELEMENT");

		/*
		 * Please note that add method DOES NOT overwrites the element
		 * previously at the specified index in the list. It shifts the elements
		 * to right side and increasing the list size by 1.
		 */

		System.out.println("ArrayList contains...");
		// display elements of ArrayList
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));
		
		//Returns the index of the first occurrence of the specified element
		System.out.println("Index of the String 2 is : " + arrayList.indexOf("2"));
		
		//returns -1 if the list does not contain the specified element
		System.out.println("Index of the number 2 is : " + arrayList.indexOf(2));

	}

}
