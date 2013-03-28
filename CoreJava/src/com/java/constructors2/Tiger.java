package com.java.constructors2;

public class Tiger extends WildAnimal{
	public static void main(String args[]){
		System.out.println(" Tiger main method ");
	}

	Tiger(){
		System.out.println("Constructor : TigerAnimal");
	}
	
	Tiger(String t){
		System.out.println("Constructor : TigerAnimal : " + t);
	}
}
