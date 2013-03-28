package com.java.collection.nullValues;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		
		//TreeSet will not contain null values
		//TreeSet cannot contain duplicate values
		//TreeSet sorts values in order
		Set<String> set = new TreeSet<String>();
		set.add("raghu");
		set.add("ben");
		set.add(null);
		set.add(null);
		set.add("null");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println("Values in a TreeSet are : " + itr.next());
		}
	}
}
