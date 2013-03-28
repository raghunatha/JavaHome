package com.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringRemove {

	public static void main(String[] args) {
		
		String input = "Just to clarify, I will have strings of varying "
			      + "lengths. I want to strip characters from it, the exact "
			      + "ones to be determined at runtime, and return the "
			      + "resulting string.";
		
		stripChars(input, "J");
		System.out.println(input.toString());
		Set s1 = new HashSet();
		s1.add(1);
		System.out.println(s1.add(2));
		
		Map m1 = new HashMap();
		m1.put(2, 1);
		System.out.println(m1.put(2,1));
		System.out.println(m1.containsKey(2));
		
		List l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println("Max is :" + Collections.max(l1));
		System.out.println(l1.indexOf(Collections.max(l1)));
		System.out.println(l1.remove(2));
		System.out.println("Max is :" + Collections.max(l1));
		
	}
	
	public static String stripChars(String input, String strip) {
	    StringBuilder result = new StringBuilder();
	    for (char c : input.toCharArray()) {
	    	//If no such value of c exists then -1 is returned
	        if (strip.indexOf(c) == -1) {
	            result.append(c);
	        }
	    }
	    System.out.println(result.toString());
	    return result.toString();
	}
	
	
	
}
