package com.java.HashMapAndTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
	
public static void main(String[] args) {
	
	//HashMap is not synchronized
	//HashMap allows one null key and any number of null values
	Map<String, String> map=new HashMap<String, String>(); 
	map.put(null, "Raghu"); //storing 
	map.put(null, "Ben"); //storing
	
	//Storing values in a map using null String
	map.put("null", "The Key is null String");
	
	System.out.println("The size of map is : " + map.size());
	System.out.println("Retrieving the value for the null key : " + map.get(null));//retrieving
	
	System.out.println();
	
	//Storing all the keys in t a Set object
	Set<String> set = map.keySet();
	Iterator<String> itr = set.iterator();
	while(itr.hasNext()){
		System.out.println("The values in the map are : " +map.get(itr.next()));
	}

}
}
