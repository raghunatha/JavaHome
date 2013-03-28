package com.java.basics.convertions;

public class ConvertFromString {
	  public static void main(String[] argv) {

	    String sValue = "5";

	    try {
	    	//2 ways of converting Stirng to int
	    	int iValue = new Integer(sValue).intValue();
	    	int iValue_New = Integer.parseInt(sValue);
	      System.out.println("iValue = " + iValue);
	      System.out.println("iValue_New = " + iValue_New);
	    } catch (NumberFormatException ex) {
	      ex.printStackTrace();
	    }
	  }
	}