package com.java.constructors2;

public class PetAnimal extends Animal{
	public static void main(String args[]){
		System.out.println(" PetAnimal main method ");
	}

	PetAnimal(String animalName){
		System.out.println("Parameterized Constructor : PetAnimal : " + animalName);
	}
	
	/*PetAnimal(){
		System.out.println(" Default Constructor : PetAnimal");
	}*/
}
