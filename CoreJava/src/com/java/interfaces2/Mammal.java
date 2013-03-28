/*
 * Implementing interfaces
 */

/**
 * @author raghu natha reddy S
 */
package com.java.interfaces2;

public class Mammal implements Animal{

	   //Defining the implementations for the methods in the interface 	
	   public void eat(){
	      System.out.println("Mammal eats");
	   }

	   public void travel(){
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs(){
	      return 0;
	   }

	   public static void main(String args[]){
	      Mammal m = new Mammal();
	      m.eat();
	      m.travel();
	   }
	}