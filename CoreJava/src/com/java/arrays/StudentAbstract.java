package com.java.arrays;

public abstract class StudentAbstract {

	private String studentName;
	private int studentId;
	
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public abstract void sayHi();
}
