package com.java.constructors1;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp = new Employee(1, "Robert");
		System.out.println(emp.printEmployeeDetails());
		emp.printEmployeeDetails(1);
		emp.printEmployeeDetails("Siva");
		//emp.Employee(2, "test"); // The method Employee(int, String) is undefined for the Employee type
	}

}
