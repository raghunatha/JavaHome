package com.java.HashMapAndTable;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {
	public static void main(String[] args) {
		
		//TreeMap cannot contain null keys
		//TreeMap allows null values
		//TreeMap sorts the map based on the keys by default
		Map<String, String> map=new TreeMap<String, String>(); 
		//map.put(null, "Raghu"); //storing 
		//map.put(null, "Ben"); //storing
		map.put("A", "Raghu");
		map.put("C", "Chintu");
		map.put("B", "Happy");
		map.put("b", null);
		
		//Storing values in a map using null String
		map.put("null", "The Key is null String");
		
		System.out.println("The size of map is : " + map.size());
		System.out.println("Retrieving the value for the key, null String is : " + map.get("null"));//retrieving
		
		System.out.println();
		
		//Storing all the keys in to a Set object
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println("The values in the treep map are : " +map.get(itr.next()));
		}

	}
}