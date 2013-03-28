package com.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert {
	public static void main(String[] args) {
		Set hashset = new HashSet();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		List list = new ArrayList(hashset);
		System.out.println(list.toString());
		
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		Set s = new HashSet(list1);
		System.out.println(s.toString());
	}
}
