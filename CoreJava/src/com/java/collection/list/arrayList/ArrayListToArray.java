package com.java.collection.list.arrayList;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to ArrayList
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");

		/*
		 * To copy all elements of java ArrayList object into array use Object[]
		 * toArray() method.
		 */
///int[] array = arrayList.toArray();
		Object[] objArray = arrayList.toArray();

		// display contents of Object array
		System.out
				.println("ArrayList elements are copied into an Array. Now Array Contains..");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);
	}
}
