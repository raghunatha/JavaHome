package com.java.core;

public class Student {

	public int studentId;
	public String StudentName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public static void main(String[] args) {
		Student studentObject = new Student();
		
		studentObject.setStudentId(1);
		studentObject.setStudentName("raghu");
		
		
		System.out.println(studentObject.getStudentId());
		System.out.println(studentObject.getStudentName());
	}
}
