package com.java.constructors2;

public class WildAnimal extends Animal{
	public static void main(String args[]){
		System.out.println(" WildAnimal main method ");
	}

	WildAnimal(){
		System.out.println("Constructor : WildAnimal");
	}
	
	WildAnimal(String s){
		System.out.println("Constructor : WildAnimal : " + s);
	}
}
