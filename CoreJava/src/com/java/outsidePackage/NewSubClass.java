/*
 * simple Sub class extending a super class
 * Subclasses inherit those member variables declared with no access specifier as long as the subclass is in the same package as the superclass.
 * Subclasses inherit those superclass methods declared with no access specifier as long as the subclass is in the same package as the superclass.
 * Uncomment the below commented code
 */

/**
 * @author raghu natha reddy S
 */
package com.java.outsidePackage;

import com.java.inheritance3.SuperClass;

public class NewSubClass extends SuperClass {

    public static void main(String[] args) {
    	int defaultVariable = 6;
        NewSubClass s = new NewSubClass();
        s.printMethod();         
        //s.defaultMethod();
        //System.out.println("s.defaultVariable value in main method = " + s.defaultVariable);
        //System.out.println("s.publicVariable value in main method = " + s.publicVariable);
        //System.out.println("s.privateVariable value in main method = " + s.privateVariable);
        System.out.println("defaultVariable value in main method = " + defaultVariable);
    }
    
    // overrides printMethod in SuperClass
    public void printMethod() {
        super.printMethod();
        System.out.println("Call to SubClass printMethod.");
        //System.out.println("defaultVariable value in printMethod = " + defaultVariable);
    }
    
    //local method
    public void testMethod() {
    	int defaultVariable = 7;
        System.out.println("Call to SubClass testMethod.");
        //System.out.println("defaultVariable value in testMethod = " + defaultVariable);
        //System.out.println("publicVariable value in testMethod = " + publicVariable);
    }

}