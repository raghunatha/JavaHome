package com.java.enum1;

public class RnrTech {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//forcefully restricting someone from sending junk data
		emp1.setDay(Day.MONDAY);
		
		Employee emp2 = new Employee(1, "Raghu");
		Employee emp3 = new Employee(1, "Raghu");
		
		if(emp2.equals(emp3)){
			System.out.println("objects are equal");
		}
		
		System.out.println(emp2.toString());
	}
	
}