package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("siva", "password");
		hashMap.put("ash", "password");
		hashMap.put("siva", "newpassword");
		hashMap.put("ganesh", "password");
		
		hashMap.size();
		
		System.out.println(hashMap.size());

		// Using iterator
		
		Iterator<String> hashMapIterator = hashMap.keySet().iterator(); 
	    while(hashMapIterator.hasNext()){
	    	String key = hashMapIterator.next();
	    	String value = hashMap.get(key);
	    	
	    	System.out.println("Key : "+key+" value : "+value);
	    }
	
	    // Enhanced For loop
	    System.out.println("***************************");
	    System.out.println("Enhaced for Loop");
	    for(String key:hashMap.keySet()){
	    	String value = hashMap.get(key);
	    	System.out.println("Key : "+key+" value : "+value);
	    }
	    
	    
	    
	    
	}

}
