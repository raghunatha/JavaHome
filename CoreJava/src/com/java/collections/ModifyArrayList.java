/*
 * http://techvivek.wordpress.com/2009/08/29/difference-between-arraylist-and-copyonwritearraylist/
 */

package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModifyArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("raghu");
		list.add("naveen");
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.add("praveen"); // As we have modified the ArrayList after
									// displaying first element, it will throw a
									// ConcurrentModificationException at when
									// we call next() next time
		}
	}
}
