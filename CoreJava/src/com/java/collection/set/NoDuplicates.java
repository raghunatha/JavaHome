package com.java.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NoDuplicates {
	public static void main(String[] args) {
		
		String[] UserInput = { "C", "C++", "java", ".net", "cobol", "java", "C++"};
		Integer[] testInteger = {6,3,2,5,4,7,3,4,2,1};
		
		//The constructor HashSet<String>(List<Integer>) is undefined
		//Set set = new HashSet<String>(Arrays.asList(testInteger));
		
		Set hashSet = new HashSet<String>(Arrays.asList(UserInput));
		Set hashSetTestInteger = new HashSet(Arrays.asList(testInteger));
		System.out.println("The values present in the hashSet : "+ hashSet);
		System.out.println("The values present in the hashSetTestInteger : "+ hashSetTestInteger);
		System.out.println("HashSet makes no guarantees concerning the order of elements");
		System.out.println();
		
		Set linkedHashSet = new LinkedHashSet<String>(Arrays.asList(UserInput));
		Set linkedHashSetTestInteger = new HashSet(Arrays.asList(testInteger));
		System.out.println("The values present in the linkedHashSet : "+ linkedHashSet);
		System.out.println("The values present in the linkedHashSetTestInteger : "+ linkedHashSetTestInteger);
		System.out.println("LinkedHashSet orders its elements based on the order in which they were inserted into the set (insertion-order)");
		System.out.println();
		
		Set treeSet = new TreeSet<String>(Arrays.asList(UserInput));
		Set treeSetTestInteger = new HashSet(Arrays.asList(testInteger));
		System.out.println("The values present in the treeSet : "+ treeSet);
		System.out.println("The values present in the treeSetTestInteger : "+ treeSetTestInteger);
		System.out.println("TreeSet orders its elements based on their values");
		System.out.println();
		
		System.out.println("Generic Conclusion : Duplicate elements are prohibited in a set");
		
	}

}
