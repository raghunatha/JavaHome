package com.java.constructors1;

public class Employee {

	private int employeeId;
	private String employeeName;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public String printEmployeeDetails() {
		return getEmployeeId() + " : " + getEmployeeName();
	}

	public void printEmployeeDetails(String caller) {
		System.out.println(caller + " printed " + printEmployeeDetails());
	}

	public void printEmployeeDetails(int callerId) {
		System.out.println(callerId + " printed " + printEmployeeDetails());
	}
}
