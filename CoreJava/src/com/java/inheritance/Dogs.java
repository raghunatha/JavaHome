package com.java.inheritance;

public class Dogs extends Mammal{
	   public static void main(String args[]){

	      Animal a = new Animal();
	      Mammal m = new Mammal();
	      Dogs d = new Dogs();

	      System.out.println(m instanceof Animal);//Mammal is a sub classes of Animal class.
	      System.out.println(d instanceof Mammal);//Dogs is a sub class of Mammal class.
	      System.out.println(d instanceof Animal);//Dogs is a sub class of Animal class also.
	   }
	}
