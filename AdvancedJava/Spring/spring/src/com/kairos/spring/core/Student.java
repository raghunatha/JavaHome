package com.kairos.spring.core;

import java.util.HashMap;

public class Student {
	
	private int studentId;
	private String studentName;
	private String course;
	private Address address;
	
	private HashMap<String, String> marks;
	
	public HashMap<String, String> getMarks() {
		return marks;
	}


	public void setMarks(HashMap<String, String> marks) {
		this.marks = marks;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Student(int studentId,String studentName,String course) {
	
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
		
	}

}
