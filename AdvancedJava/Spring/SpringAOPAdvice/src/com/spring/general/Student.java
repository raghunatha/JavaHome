package com.spring.general;

public class Student {

	private String studentId;
	private String studentName;

	// Student can have an address associated
	private Address addressObject;

	public Address getAddressObject() {
		return addressObject;
	}

	public void setAddressObject(Address addressObject) {
		this.addressObject = addressObject;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
