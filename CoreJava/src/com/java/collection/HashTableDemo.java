package com.java.collection;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		
		hashTable.put("siva", "password");
		hashTable.put("ash", "password");
		hashTable.put("siva", "newpassword");
		hashTable.put("ganesh", "password");
		
		System.out.println(hashTable.size());

		// Using iterator
		
		Iterator<String> HashtableIterator = hashTable.keySet().iterator(); 
	    while(HashtableIterator.hasNext()){
	    	String key = HashtableIterator.next();
	    	String value = hashTable.get(key);
	    	
	    	System.out.println("Key : "+key+" value : "+value);
	    }
	
	    // Enhanced For loop
	    System.out.println("***************************");
	    System.out.println("Enhaced for Loop");
	    for(String key:hashTable.keySet()){
	    	String value = hashTable.get(key);
	    	System.out.println("Key : "+key+" value : "+value);
	    }
	    
	    
	    
	    
	}

}
