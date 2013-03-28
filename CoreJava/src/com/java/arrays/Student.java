package com.java.arrays;

public class Student extends StudentAbstract{
	
	private String course;
	
	public Student(){
		System.out.println("default constructor");
	}
	
	public Student(int studentId,String studentName,String course){		
		this.setStudentId(studentId);
		this.setStudentName(studentName);
		this.course=course;		
	}
	
	
	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public void printDetails(){		
		System.out.println(getStudentName()+getStudentId()+getCourse());
	}



	@Override
	public void sayHi() {
		System.out.println("Hai " + getStudentName());		
	}


}
