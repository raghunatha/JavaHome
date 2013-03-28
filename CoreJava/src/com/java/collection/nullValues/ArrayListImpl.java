package com.java.collection.nullValues;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListImpl {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		//Adding values to list 
		list.add("raghu");
		//Array List can contain null values
		list.add(null);
		list.add(null);
		//Adding null String to Array list
		list.add("null");
		

		Iterator itrr = list.iterator();
		while (itrr.hasNext()) {
			System.out.println("The values in the list : " + itrr.next());
		}
	}
}
