package com.java.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/beans/SpringBeans.xml");
		
		Student student = (Student)context.getBean("student");
		System.out.println("Student name Before changing the value: " + student.getStudentName());
		student.setStudentName("Raghu");
		System.out.println("Student name : " + student.getStudentName());
		
		Student newStudent = (Student)context.getBean("student");
		System.out.println("Student name before changing value: " + newStudent.getStudentName());
		newStudent.setStudentName("Sandhya");
		System.out.println("Student name : " + newStudent.getStudentName());
	}
}
