/*
 * simple Sub class extending a super class
 */

/**
 * @author raghu natha reddy S
 */
package com.java.inheritance3;

public class SubClass extends SuperClass {

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();   
        System.out.println(s.defaultVariable);
    }    

}