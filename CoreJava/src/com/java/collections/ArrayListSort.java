package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
	public static void main(String[] args) {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("3");
		arrayList.add("5");
		arrayList.add("2");
		arrayList.add("4");

		/*
		 * To sort an ArrayList object, use Collection.sort method. This is a
		 * static method. It sorts an ArrayList object's elements into ascending
		 * order.
		 */
		Collections.sort(arrayList);

		// display elements of ArrayList
		System.out
				.println("ArrayList elements after sorting in ascending order : ");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		

		/*
		 * To reverse an ArrayList object, use Collection.reverse method. This is a
		 * static method. It reverses the order of elements in the specified list
		 */
		Collections.reverse(arrayList);

		// display elements of ArrayList
		System.out
				.println("ArrayList elements after reversing the order : ");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		
		//making the list read only
		List<String> readOnlyList = Collections.unmodifiableList(arrayList);
		readOnlyList.add(1, "55");// unsupported operation exception as the list is read only

	}
}
