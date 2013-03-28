package com.java.inheritance;

public class Animal {
}

class Mammal extends Animal {
	//Mammal IS-A Animal
}

class Reptile extends Animal {
	//Reptile IS-A Animal
}

class Dog extends Mammal {
	//Dog IS-A Mammal
	//Hence : Dog IS-A Animal as well
}