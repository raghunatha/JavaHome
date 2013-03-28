package com.java.collection.set;

import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
		String[] UserInput = { "raghu", "natha", "Reddy", "sanivarapu", ""};
		
		Set<String> hashSet = new HashSet<String>();
		System.out.println("HashSet is the best-performing implementation. However it makes no guarantees concerning the order of elements");
		for (String temp : UserInput) {
			//System.out.println("temp value : " + temp);
			if (!hashSet.add(temp)) {
				// System.out.println(hashSet.add(temp));				
				System.out.println("Duplicate detected: " + temp);
			}
		}
		System.out.println(hashSet.size() + " distinct words: " + hashSet);
		System.out.println();
		
		
		System.out.println("LinkedHashSet orders its elements based on the order in which they were inserted into the set (insertion-order)");
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		for (String temp : UserInput) {
			if (!linkedHashSet.add(temp)) {
				System.out.println("Duplicate detected: " + temp);
			}
		}
		System.out.println(linkedHashSet.size() + " distinct words: " + linkedHashSet);
		System.out.println();
		
		System.out.println("TreeSet orders its elements based on their values. It is substantially slower than HashSet");
		Set<String> treeSet = new TreeSet<String>();
		for (String temp : UserInput) {
			if (!treeSet.add(temp)) {
				System.out.println("Duplicate detected: " + temp);
			}
		}
		System.out.println(treeSet.size() + " distinct words: " + treeSet);
		
		if(false && false ||true){
			System.out.println("true");
		}
		
		
	}
}