package com.java.enum1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String joiningDay;
	
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

	public String getJoiningDay() {
		return joiningDay;
	}

	public void setJoiningDay(String joiningDay) {
		this.joiningDay = joiningDay;
	}	
	
	public Employee(int employeeId, String employeeName, String joiningDay) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joiningDay = joiningDay;
	}

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee() {
		super();
	}
	
	public void setDay(Day day){
		if(day.equals(Day.MONDAY)){
			System.out.println("MONDAY");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + "]";
	}
	
}
