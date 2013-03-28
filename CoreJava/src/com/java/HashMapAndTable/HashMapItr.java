package com.java.HashMapAndTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapItr {
	
public static void main(String[] args) {
	
	Map<String, String> map=new HashMap<String, String>(); 
	map.put("A", "Raghu"); //storing 
	map.put("B", "Ben"); //storing
	map.put("C", "Naveen");
	
	System.out.println("The size of map is : " + map.size());
	System.out.println("Retrieving the value for the key C : " + map.get("C"));//retrieving
	//When we try to retrieve a value for the key which is not present in the map, the map returns a null value
	System.out.println("Retrieving the value for the key D : " + map.get("D"));//retrieving
	
	System.out.println();
	
	//Storing all the keys in t a Set object
	Set<String> s1 = map.keySet();
	Iterator s1Itr = s1.iterator();
	
	while(s1Itr.hasNext()){
		System.out.println(map.get(s1Itr.next()));
	}
	
	
	Set<Entry<String,String>> set = map.entrySet();
	
	Iterator<Entry<String, String>> itr = set.iterator();
	while(itr.hasNext()){
		System.out.println("The values in the map are : " +(itr.next()).getKey());
	}

}
}
