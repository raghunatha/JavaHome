package com.java.constructor;

class TestConstructor {
	// legal constructors
	TestConstructor() { }
	private TestConstructor(byte b) { }
	TestConstructor(int x) { }
	TestConstructor(int x, int... y) { }
	// illegal constructors
	void TestConstructor() { } // it's a method, not a constructor
	//TestConstructor1() { } // not a method or a constructor
	//TestConstructor(short s); // looks like an abstract method
	//static TestConstructor(float f) { } // can't be static
	//final TestConstructor(long x) { } // can't be final
	//abstract TestConstructor(char c) { } // can't be abstract
	//TestConstructor(int... x, int t) { } // bad var-arg syntax
	}
