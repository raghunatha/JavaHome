package com.java.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class AddCopyOnWriteArrayList {

	public static void main(String args[]) {
		
		CopyOnWriteArraySet s1 = new CopyOnWriteArraySet();
		s1.add(1);
		s1.add(1);
		Iterator i1 = s1.iterator();
		while(i1.hasNext()){
			System.out.println(" ********* : " + i1.next());
		}
		
		
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("raghu");
		list.add("kumar");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			list.add("naveen");
		}
		System.out.println();
		System.out.println("After modification:");
		Iterator i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		// We did not get any ConcurrentModificationExceptionat as
		// CopyOnWriteArrayList keeps a copy of original List and iterate over
		// this. The new value which has been added is merged to copy of orignal
		// array only after Iteration is over.
	}
}
