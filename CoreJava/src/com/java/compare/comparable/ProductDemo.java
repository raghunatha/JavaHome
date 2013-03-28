package com.java.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDemo {
	public static void main(String[] args) {
		
		//creating objects and initializing Product class
		Product product_one = new Product("A1", "Rice", 10.0);
		Product product_two = new Product("B1", "Wheat", 5.5);		
		
		List<Product> list = new ArrayList<Product>();				
		list.add(new Product("C1", "Sugar", 2.0));
		list.add(product_one);
		list.add(product_two);	
		
		System.out.println("Values before sorting the list");
		for(Product productObject: list)
			System.out.println(productObject.getProduct_Id());
		
		/*The sort method calls the overwritten compareTo(T) method in the Product class
		 * and sorts the objects based on the product ID
		 */		 
		/*
		 * for the list to be eligible for sorting using Collections.sort method the "elements in the list must implement the Comparable interface"
		 */
		Collections.sort(list);
		System.out.println("");
		System.out.println("Values after sorting the list");
		for(Product productObject: list)
			System.out.println(productObject.getProduct_Id());
	}
}
