package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// create an ArrayList object
		ArrayList arrayList = new ArrayList();

		// Add elements to ArrayList
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("raghu");
		arrayList.add("4");
		arrayList.add("naveen");

		for (Object i : arrayList)
			System.out.println(i);
		
		//converting arrayList to a String array
		String[] newArray = (String[])arrayList.toArray();
		String[] diffArray = (String[])arrayList.toArray(new String[arrayList.size()]);
		
		System.out.println();
		
		// Create an ArrayList which can hold only Integers
		List<Integer> list = new ArrayList<Integer>();
		
		// Add elements to ArrayList
		//list.add("1"); //Not applicable for the string argument
		//list.add("raghu"); //Not applicable for the string argument
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		//Converting the list to an Array
		Integer[] numbers = list.toArray(new Integer[list.size()]);
		System.out.println("The length of the Integer array : " + numbers.length);
		
		for(int value : numbers)
			System.out.println(value);

	}
}
