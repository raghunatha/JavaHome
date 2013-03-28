package com.java.constructors2;

public class Cat extends PetAnimal{
	public static void main(String args[]){
		System.out.println(" Cat main method ");
	}

	//In every constructor the default call at the first line will be to the default constructor by using super()
	//If the super class contains only parameterized constructor then the call "super(name)" must be written explicitly  
	Cat(String name){
	  	super(name);
		//this();
		//this(1); 
		System.out.println("Parameterized Constructor : CatAnimal");
	}
	
	Cat(){
	  	super("tomy");
		System.out.println("Constructor : CatAnimal");
	}
	
	Cat(int a){
	  	super("tomy");
		System.out.println("Constructor : CatAnimal");
	}
}
