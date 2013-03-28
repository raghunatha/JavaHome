package com.java.method;


public class ReturningFromMethods {

	public void print() {
		System.out.println("This is a simple print method");
	}
	
	public void print1() {
		System.out.println("This is a simple print method");
		//A return statement can be used to branch out of a control flow block and exit the method
		return;
	}
	
	public void print2() {
		System.out.println("This is a simple print method");
		//When the return type is void the method cannot return a value
		//return 5;
	}
	
	public int print3() {
		System.out.println("This is a simple print method");
		//Any method that is not declared void must contain a return statement with a corresponding return value
		return 5;
	}
	
	//When a method uses a class name as its return type, the returned object must be either a subclass of, or the exact class of, the return type
	//Return type is Employee and the returned object is also an Employee object
	public Employee print4() {
		Employee employee = new Employee();
		employee.setEmployee_Id(1);
		employee.setEmployee_Name("raghu");
		employee.setEmployee_Salary(500);
		return employee;
	}
	
	//Return type is Employee and the returned object is SalesEmployee which is a sub class of the Employee class
	public Employee print5() {
		SalesEmployee salesEmployee = new SalesEmployee();
		salesEmployee.setEmployee_Id(1);
		salesEmployee.setEmployee_Name("raghu");
		salesEmployee.setEmployee_Salary(500);
		salesEmployee.setSalesRep_Department_ID(111);
		salesEmployee.setSalesRep_Region("Irving");
		return salesEmployee;
	}
	
}
