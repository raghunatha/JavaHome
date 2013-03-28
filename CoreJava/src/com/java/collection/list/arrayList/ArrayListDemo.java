package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		System.out.println("The size of the array list : " + arr.size());
		
		//Constructs an empty list with the specified initial capacity
		ArrayList arrNew = new ArrayList(5);
		System.out.println("The size of the array list : " + arrNew.size());
		
		//arrNew the collection whose elements are to be placed into this list
		ArrayList arrList = new ArrayList(arrNew);
		System.out.println("The size of the array list : " + arrList.size());
		
		List list = new ArrayList();
		System.out.println("The size of the array list : " + list.size());
	}

}
