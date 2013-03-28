package com.java.basics.dataTypeAndVariables;

public class TypeConversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		String integerValue = "10";
		String doubleValue = "10.35";
		
		//Integer aaa = 6666666622; //the literal 6666666622 of type int is out of range 
		
		int intValue = Integer.parseInt(integerValue);
		double value = Double.valueOf(doubleValue);
		
		System.out.println(intValue+"  : "+value);

		
		String fromInteger = String.valueOf(intValue);
		String fromDouble = String.valueOf(value);
		System.out.println(fromInteger+" : "+fromDouble);
	}

}
