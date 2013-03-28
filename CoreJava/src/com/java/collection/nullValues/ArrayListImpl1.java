package com.java.collection.nullValues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ArrayListImpl1 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("Raghu");
		list.add("Ben");
		list.add("Madiha");
		//Adding a duplicate value
		list.add("Raghu");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		System.out.println();
		Set set = new HashSet();
		
		set.add("Raghu");
		set.add("Ben");
		set.add("Madiha");
		//Adding a duplicate value
		set.add(null);
		//set.add(1);
		
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println("$$$$$$ : " +iter.next());
		}
		
		System.out.println();
		Map map = new Hashtable();
		
		//A map stores values in key value pairs
		map.put(1, "raghu");
		map.put(1, "ben");
		map.put(1,  "madiha");
		
		System.out.println(" ****** : " + map.size());
		System.out.println();
		
		//To iterate over map we cannot use an iterator direclty on a map object
		//So get all the keys in to a Set object and iterate over the set object and get the map elements
		Set s1 = map.keySet();
		Iterator itrr = s1.iterator();
		while(itrr.hasNext()){
			System.out.println(map.get(itrr.next()));
		}
		
		System.out.println();
		Map map1=new HashMap(); 
		map1.put(null, "Raghu"); //storing 
		map1.put(null, "Ben"); //storing 
		System.out.println(map1.get(null));//retrieving
		
		Set s11 = map1.keySet();
		Iterator itrr1 = s11.iterator();
		while(itrr1.hasNext()){
			System.out.println("^^^^^^ : " +map1.get(itrr1.next()));
		}
		
		System.out.println();
		Map map2=new Hashtable(); 
		map2.put(null, "Raghu1"); //storing 
		map2.put(null, "Ben1"); //storing 
		System.out.println(map2.get(null));//retrieving
	}
}
