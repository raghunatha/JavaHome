package com.java.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAppend {

	public static void main(String[] args) {
		//create an ArrayList object
	    List arrayList = new ArrayList();
	   
	    //Add elements to Arraylist
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    
	    //create an ArrayList object
	    List newArrayList = new ArrayList();
	   
	    //Add elements to Arraylist
	    newArrayList.add("5");
	    newArrayList.add("7");
	    newArrayList.add("4");
	    
	    /*
	      To append all elements of another Collection to ArrayList use
	      boolean addAll(Collection c) method.
	      It returns true if the ArrayList was changed by the method call.
	    */	   
	    //append all elements of Vector to ArrayList
	    boolean listModified = arrayList.addAll(newArrayList);
	    System.out.println("Is the list modified : " + listModified);
	   
	    //display elements of ArrayList
	    System.out.println("After appending all elements, ArrayList contains..");
	    for(int i=0; i<arrayList.size(); i++)
	      System.out.println(arrayList.get(i));
	}

}
