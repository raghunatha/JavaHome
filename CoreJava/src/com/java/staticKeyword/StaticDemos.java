package com.java.staticKeyword;

public class StaticDemos {
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		t1.run();
		t1.eat();
		
		//static variables and methods can be called directly by using class name
		System.out.println(Test.b);
		Test.eat();
	}
}

class Test {

	int a;
	static int b;

	public void run() {
		System.out.println("non static run method");
	}

	public static void eat() {
		//Keyword super cannot be used inside static methods
		//super --> wrong
		System.out.println("static eat method");
	}
}
