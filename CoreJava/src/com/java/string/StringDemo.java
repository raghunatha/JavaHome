package com.java.string;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String sampleString = "This is a sample String ";
		String emptyString="";
		String anotherSampleString = new String("hello you are watching this");
		
		//String anotherSampleString = sampleString;
		if(sampleString.equals(anotherSampleString)){
			
			System.out.println("Both Strings are equal");
		}
		
	/*	if(sampleString == anotherSampleString){
			
			System.out.println("Both variables pointing to same object");
		}*/
		
		System.out.println(sampleString.charAt(6));
		System.out.println(sampleString.compareTo(anotherSampleString));
		System.out.println(sampleString.concat(anotherSampleString));
		System.out.println(sampleString+anotherSampleString);
		System.out.println(sampleString+10);
		System.out.println(sampleString.contains("samples"));
		System.out.println(sampleString.endsWith("String"));
		System.out.println(sampleString.equals("THIS IS A SAMPLE STRING"));
		System.out.println(sampleString.equalsIgnoreCase("THIS IS A SAMPLE STRING"));
		System.out.println(sampleString.indexOf('s'));
		System.out.println(sampleString.lastIndexOf('s'));
		//System.out.println(emptyString.isEmpty());
		System.out.println(sampleString.length());
		System.out.println(sampleString.replace('s', 't'));
		System.out.println(sampleString);
		System.out.println(sampleString.replaceAll("is", "si"));
		System.out.println(sampleString.replaceFirst("is", "si"));
		System.out.println(sampleString.substring(1));
		System.out.println(sampleString.substring(0,5)+"*");
		System.out.println(sampleString.toString());
		System.out.println(sampleString.trim());
		System.out.println(sampleString.valueOf(10.0));
		System.out.println(sampleString.toLowerCase());
		System.out.println(sampleString.toUpperCase());
		
	}

}
