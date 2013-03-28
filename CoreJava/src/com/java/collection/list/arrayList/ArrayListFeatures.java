package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {

		// create an ArrayList object
		List arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("1");
		arrayList.add("3");

		// display elements of ArrayList
		System.out
				.println("After appending all elements, ArrayList contains..");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		/*
		 * Output is 1 2 1 3 a) Ordering is maintained (output order is same as
		 * the input order) b) Contains duplicate elements (uniqueness is not
		 * maintained)
		 */

		/*
		 * To remove an element from the specified index of ArrayList use Object
		 * remove(int index) method. It returns the element that was removed
		 * from the ArrayList.
		 */
		Object obj = arrayList.remove(2);
		System.out.println(obj + " is removed from ArrayList");

		System.out.println("ArrayList contains...");
		// display elements of ArrayList
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));

		/*
		 * To remove all elements from the ArrayList use void clear() method.
		 */
		arrayList.clear();
		System.out.println("Size of ArrayList after removing elements : "
				+ arrayList.size());
	}
}
