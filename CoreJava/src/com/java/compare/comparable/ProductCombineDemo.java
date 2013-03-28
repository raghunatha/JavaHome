package com.java.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductCombineDemo {
	public static void main(String[] args) {
		
		//creating objects and initializing Product class
		CombineProduct product_one = new CombineProduct("A1", "Rice", 10.0);
		CombineProduct product_two = new CombineProduct("B1", "Wheat", 5.5);		
		
		List<CombineProduct> list = new ArrayList<CombineProduct>();				
		list.add(new CombineProduct("C1", "Sugar", 2.0));
		list.add(product_one);
		list.add(product_two);	
		
		System.out.println("Values before sorting the list");
		for(CombineProduct productObject: list)
			System.out.println(productObject.getProduct_Id());
		
		/*The sort method calls the overwritten compareTo(T) method in the Product class
		 * and sorts the objects based on the product ID
		 */		 
		/*
		 * for the list to be eligible for sorting using Collections.sort method the "elements in the list must implement the Comparable interface"
		 */
		Collections.sort(list);
		System.out.println("");
		System.out.println("Values after sorting the list based on Id");
		for(CombineProduct productObject: list)
			System.out.println(productObject.getProduct_Id());
		
		System.out.println("");
		Collections.sort(list, new CombineProduct());
		System.out.println("");
		System.out.println("Values after sorting the list based on price");
		for(CombineProduct productObject: list)
			System.out.println(productObject.getProduct_Id());
	}
}
