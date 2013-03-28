package com.java.collection;

import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		
		treeMap.put("siva", "password");
		treeMap.put("ash", "password");
		treeMap.put("siva", "newpassword");
		treeMap.put("ganesh", "password");
		
		System.out.println(treeMap.size());

		// Using iterator
		
		Iterator<String> TreeMapIterator = treeMap.keySet().iterator(); 
	    while(TreeMapIterator.hasNext()){
	    	String key = TreeMapIterator.next();
	    	String value = treeMap.get(key);
	    	
	    	System.out.println("Key : "+key+" value : "+value);
	    }
	
	    // Enhanced For loop
	    System.out.println("***************************");
	    System.out.println("Enhaced for Loop");
	    for(String key:treeMap.keySet()){
	    	String value = treeMap.get(key);
	    	System.out.println("Key : "+key+" value : "+value);
	    }
	    
	    
	    
	    
	}

}
