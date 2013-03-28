package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIterator {
	public static void main(String[] args) {
		//create an ArrayList object
	    ArrayList arrayList = new ArrayList();
	   
	    //Add elements to Arraylist
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("4");
	    arrayList.add("5");
	   
	    /*
	      Get a ListIterator object for ArrayList using
	      listIterator() method.
	    */
	    ListIterator itr = arrayList.listIterator();
	   
	    /*
	      Use hasNext() and next() methods of ListIterator to iterate through
	      the elements in forward direction.
	    */
	    System.out.println("Iterating through ArrayList elements in forward direction...");
	    while(itr.hasNext())
	      System.out.println(itr.next());
	 
	    /*
	      Use hasPrevious() and previous() methods of ListIterator to iterate through
	      the elements in backward direction.
	    */
	    System.out.println("Iterating through ArrayList elements in backward direction...");
	    while(itr.hasPrevious())
	      System.out.println(itr.previous());	}
}
