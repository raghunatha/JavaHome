package com.java.classLoading.dynamicClassLoading;

public class DynamicClassLoading {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {	
	
	String loadClass = "Cat";
	Animal animal = null;
	//Dynamic class loading using Class.forName(String)
	System.out.println(Class.forName("com.java.classLoading.dynamicClassLoading.Cat"));
	System.out.println(Class.forName("com.java.classLoading.dynamicClassLoading.Dog"));
	
	if(loadClass.equals("Cat")){
		Class dynamic = Class.forName("com.java.classLoading.dynamicClassLoading.Cat"); // static method which returns the class object associated with the class name
		animal = (Animal) dynamic.newInstance(); // non-static method which creates an instance of the above created class
	}else{
		Class dynamic = Class.forName("com.java.classLoading.dynamicClassLoading.Dog");
		animal = (Animal) dynamic.newInstance();
	}
	
	System.out.println("Animal loaded is : " + animal.getClass().getName());
	System.out.println("Animal loaded is : " + animal.getClass().getSimpleName());
	
	//Dynamic class loading using ClassLoader
	ClassLoader classLoader = DynamicClassLoading.class.getClassLoader();	
	Class myclass = classLoader.loadClass("com.java.classLoading.dynamicClassLoading.Dog");
	animal = (Animal)myclass.newInstance();
	System.out.println("Animal loaded is : " + animal.getClass().getName());
	System.out.println("Animal loaded is : " + animal.getClass().getSimpleName());
	
}
}