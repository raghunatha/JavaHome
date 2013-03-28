package com.java.collection;

import java.util.HashMap;

public class HashMapInsideHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,HashMap<String,String>> bankAccount= new HashMap<String, HashMap<String,String>>();
		HashMap<String,String> boaCredentials = new HashMap<String,String>();
		boaCredentials.put("siva", "password");
	     
	     
	     bankAccount.put("BOA", boaCredentials);
	     HashMap<String,String> chaseCredentials = new HashMap<String,String>();
			chaseCredentials.put("siva", "password");
	     
	     bankAccount.put("Chase", chaseCredentials);
	     
	     
	     for(String key:bankAccount.keySet()){
	    	 
	    	 System.out.print(key+" : ");
	    	 HashMap<String,String> result = bankAccount.get(key);
	    	 for(String username:result.keySet()){
	    		 
	    		 System.out.println("Username : "+username+" Password : "+result.get(username));
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }
	
	}

}
