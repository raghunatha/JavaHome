package com.java.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSort {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(1);
		Collections.sort(list);		
		for(int i =0; i< list.size(); i++)
			System.out.println(list.get(i));
		
		List lst = new ArrayList();
		lst.add("A");
		lst.add("C");
		lst.add("B");
		Collections.sort(lst);
		for(Object str : lst)
			System.out.println(str);
		
		List itemList = new ArrayList();				
		itemList.add(new Item("C1", "Sugar", 2.0));
		itemList.add(new Item("B1", "Sugar", 2.0));
		itemList.add(new Item("A1", "Sugar", 2.0));
		//Cannot sort the "itemList" using Collections.sort method since Item Class is not implementing Comparable interface
		//Collections.sort(itemList);
		for(Object item: itemList)
			System.out.println(item);
	}
}