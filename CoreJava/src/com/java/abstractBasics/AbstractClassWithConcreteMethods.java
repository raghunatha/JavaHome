/*
 * A class can be abstract even if it has ZERO abstract methods
 */

package com.java.abstractBasics;

public abstract class AbstractClassWithConcreteMethods {

	public void testMethod(){
		System.out.println("This is a concrete method");
	}
}
