package com.java.inheritance1;

public class Cat extends Animal {

    public static void hide() {
        System.out.println("The hide method in Cat.");
    }

    public void override() {
        System.out.println("The override method in Cat.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat; // Making parent class reference refer to child class object
        myAnimal.hide(); // hide method in Animal is called, since the method is static
        myAnimal.override(); // override method in Cat is called, Since the reference variable is pointing to Cat object
    }
}