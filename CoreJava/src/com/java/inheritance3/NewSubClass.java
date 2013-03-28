/*
 * simple Sub class extending a super class
 * What Member Variables Does a Subclass Inherit?
 * What Methods Does a Subclass Inherit? 
 */

/**
 * @author raghu natha reddy S
 */
package com.java.inheritance3;

public class NewSubClass extends SuperClass {
	//int defaultVariable = 7;
    public static void main(String[] args) {
    	int defaultVariable = 6;
        NewSubClass s = new NewSubClass();
        s.printMethod();
        //s.privateMethod();
        s.defaultMethod();
        // printMethod(); //1.uncomment 2.change the method declaration printMethod() to printMethodTest() 
        System.out.println("s.defaultVariable value in main method = " + s.defaultVariable); //looks for class level variables
        //System.out.println("s.privateVariable value in main method = " + s.privateVariable);
        System.out.println("defaultVariable value in main method = " + defaultVariable); // looks for local variable
    }
    
    // overrides printMethod in SuperClass
    public void printMethod() {
        super.printMethod();
        //int defaultVariable = 9;
        //printMethod(); //stack Overflow error as this recursively calls the printMethod in this class
        System.out.println("Call to SubClass printMethod.");
        System.out.println("defaultVariable value in print method = " + defaultVariable); // looks for local variable in this method, if not found looks for class level variable
    }
    
    //local method
    public void testMethod() {
    	int variable = 7;
        System.out.println("Call to SubClass testMethod.");
        System.out.println("defaultVariable value in test method = " + defaultVariable);
    }
    
    //using the functionalities in the helloMethod in SuperClass and then enhancing the functionality in the SubClass 
    public void helloMethod(){    	
    	super.helloMethod(); // if this line is commented SuperClass helloMethod will never be called, in that case we are completely overriding the SuperClass helloMethod method and using only the functionality in the SubClass helloMethod		
		System.out.println("SubClass helloMethod can add some code here to add some additional functionality");
	}

}