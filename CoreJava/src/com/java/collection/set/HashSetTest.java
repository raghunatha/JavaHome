/*
Get Size of Java HashSet Example
This Java Example shows how to get the size or nubmer of elements stored in
Java HashSet object using size method.
 */

package com.java.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		// create HashSet object
		HashSet<Integer> hSet = new HashSet<Integer>();

		/*
		 * To get the size of HashSet use int size() method of HashSet class. It
		 * returns the number of elements stored in HashSet object.
		 */
		System.out.println("Size of HashSet after creation: " + hSet.size());

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));
				
		System.out.println("Size of HashSet after addition : " + hSet.size());
		System.out.println();

		// remove one element from HashSet using remove method
		hSet.remove(new Integer("1"));
		System.out.println("Size of HashSet after removal : " + hSet.size());
		System.out.println();
		
		Integer[] testInteger = {1,5,4,7,6};
		List<Integer> list = Arrays.asList(testInteger);
		//	add a collection of elements to a HashSet object
		hSet.addAll(list);
		System.out.println("The elements in the set : " + hSet);
		System.out.println();
		
		//	clones the HashSet instance object and returns a shallow copy 
		Object newSet = hSet.clone();
		System.out.println("The elements in the set after cloning : " + newSet);
		System.out.println();
		
		//	contains, checks if the specified element is present in the HashSet 
		boolean contains = hSet.contains(1);
		System.out.println("Is 1 present in the HashSet object : " + contains);
		contains = hSet.contains("raghu");
		System.out.println("Is raghu present in the HashSet object : " + contains);
		System.out.println();
		
		//	conatinsAll, checks if this collection contains all the elements mentioned in the specified collection
		List arrayList = new ArrayList();
		arrayList.add("raghu");
		arrayList.add("natha");
		arrayList.add("reddy");
		boolean containsAll = hSet.containsAll(arrayList);
		System.out.println("Does the HashSet object contain all the elements of arrayList : " + containsAll);
		List tempList = new ArrayList();
		tempList.add(1);
		tempList.add(3);
		tempList.add(2);
		//tempList.add(9);
		containsAll = hSet.containsAll(tempList);
		System.out.println("Does the HashSet object contain all the elements of tempList : " + containsAll);
		System.out.println();
		
		//	equals, compares if the given 2 sets are similar or not
		boolean equals = hSet.equals(hSet);
		System.out.println("Is hSet equals to hSet : " + equals);
		equals = hSet.equals(tempList);
		System.out.println("Is hSet equals to tempList : " + equals);
		System.out.println();
		
		//	getClass, returns the runtime class of the object hSet 
		Object classObject = hSet.getClass();
		System.out.println("The runtime class of hSet is : " + classObject);
		System.out.println();
		
		//	Returns the hash code value for the sets
		Set hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add("raghu");
		Set hs1 = new HashSet();
		hs1.add(1);
		hs1.add(2);
		hs1.add(5);
		hs1.add("raghu");		
		System.out.println("Hash code value for the object hs : " + hs.hashCode());
		System.out.println("Hash code value for the object hs1 : " + hs1.hashCode());
		System.out.println("Is hs equals hs1 ? : " + hs.equals(hs1));
		
		//	Removing all elements from the set
		hSet.clear();
		System.out.println("The elements in the set : " + hSet);
		System.out.println("The size of the set : " + hSet.size());
	}
}