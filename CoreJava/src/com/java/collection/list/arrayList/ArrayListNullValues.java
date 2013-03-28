package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNullValues {
	
	private static String name;	
	private static int x;

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();		
		list.add("1");
		list.add(name);
		list.add(name);
		//list.add(x);
		
		System.out.println("Printing the objects in the list...");
		for(int i=0 ; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		// .toString method when applied on a null object will return an error 
		/*System.out.println("Printing the string values in the list...");
		for(int i=0 ; i<list.size(); i++){
			System.out.println(list.get(i).toString());
		}*/
	}

}
