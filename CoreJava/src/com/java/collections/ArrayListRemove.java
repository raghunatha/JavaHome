package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {

	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("vivek");
		list.add("kumar");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			i.remove(); //we can use iterator’s method (remove) to modify the list
		}
		System.out.println("After modification:");
		Iterator i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
			;
		}
	}
}
