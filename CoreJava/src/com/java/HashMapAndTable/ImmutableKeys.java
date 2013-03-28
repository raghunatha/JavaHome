package com.java.HashMapAndTable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableKeys {
public static void main(String[] args) {
	
	Map map = new HashMap();
	
	String s1 = "abc";
	map.put(s1, "Raghu");	
	System.out.println("s1 = abc : " + map.get(s1));
	
	s1 = "bbc";	
	//cannot retrieve the value since the key is mutable
	System.out.println("s1 = bbc : " + map.get(s1));
	
	System.out.println("Accessing directly using abc string : " + map.get("abc"));
	
	s1 = "abc";
	//Can retrieve back the value since map object still exists in memory
	System.out.println("s1 = abc : " + map.get(s1));
	
}
}
