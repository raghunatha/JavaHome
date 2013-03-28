package com.java.collection.nullValues;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
public static void main(String[] args) {
	
	//Set contains null values. 
	//Set cannot contain duplicate values
	Set<String> set = new HashSet<String>();
	
	set.add("raghu");
	set.add("ben");
	set.add(null);
	set.add(null);
	//Adding null String in to the set --> valid
	set.add("null");
	
	//now null is printed twice, one is null value, the other one is null String
	Iterator<String> itr = set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
