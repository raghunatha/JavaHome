package com.kairos.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/core/beans.xml");
		System.out.println("**********************************");
		
		Student student = (Student)context.getBean("student");
		System.out.println("ID : "+student.getStudentId());
		System.out.println("Name : "+student.getStudentName());
		
		System.out.println("Course : "+student.getCourse());
		System.out.println("**********************************");
		
		System.out.println("Marks");
		for(String key:student.getMarks().keySet())
			System.out.println(key+" : "+student.getMarks().get(key));
		
		System.out.println("**********************************");
		
		System.out.println("Address :");
		Address address = student.getAddress();
		System.out.println(address.getLine1());
		System.out.println(address.getLine2());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getZip());
		
		System.out.println("**********************************");
		
	}

}
