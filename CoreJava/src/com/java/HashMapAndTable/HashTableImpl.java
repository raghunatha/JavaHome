package com.java.HashMapAndTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableImpl {
	public static void main(String[] args) {
		// Hashtable is synchronized
		// Hashtable does not allow null keys or null values		
		Map<Integer, String> newMap = new Hashtable<Integer, String>();
		newMap.put(1, "ramu");
		newMap.put(2, "somu");
		newMap.put(3,  null);
		newMap.put(3,  "null"); // valid, as we are storing null string
		System.out.println("Retrieving the value for the null key : " + newMap.get(3));// retrieving
		
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put(null, "Raghu"); // storing
		map.put(null, "Ben"); // storing
		System.out.println("Retrieving the value for the null key : " + map.get(null));// retrieving

		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("The values in the map are : " + map.get(itr.next()));
		}

	}
}
