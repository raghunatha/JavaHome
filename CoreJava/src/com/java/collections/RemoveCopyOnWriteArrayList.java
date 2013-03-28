package com.java.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveCopyOnWriteArrayList {

	public final static void main(String args[]) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("vivek");
		list.add("kumar");
		Iterator i = list.iterator();
		int j = 0;
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("abhishek");
			i.remove();
		}
	}
	// we cannot use iterator method to modify the elements of
	// CopyOnWriteArrayList
}
	