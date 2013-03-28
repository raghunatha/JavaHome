package com.java.string;

public class StringTests {
	public static void main(String args[]){
		String[] students = new String[10];
		String studentName = "Peter Smith";
		students[0] = studentName;
		//studentName will no longer point to the memory location containing "Peter Smith"
		studentName = null;
		
		System.out.println(students[0]);
		System.out.println(studentName);
	
		StringBuilder sb = new StringBuilder("Raghu");
		StringBuilder sb1 = new StringBuilder("Raghu");
		
		if(sb.equals(sb1)){
			
		}
		
	}

}
