package com.java.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml",
		              "Spring-Connection.xml","Spring-ModuleA.xml"});*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/beans/SpringBeans.xml");
		Student student = (Student)context.getBean("student");
		
		student.setStudentId(1);
		student.setStudentName("Raghu");
		
		System.out.println("Student Id ----------- : " + student.getStudentId());
		System.out.println("Student Name --------- : " + student.getStudentName());
		System.out.println("Student Course Id ---- : " + student.getStudentCourse().getCourseId());
		System.out.println("Student Course Name -- : " + student.getStudentCourse().getCourseName());
		System.out.println("Student Address ------ : " + student.getStudentAddress().getLine1() +", "+ student.getStudentAddress().getLine2() + ", " +student.getStudentAddress().getCity() + ", " + student.getStudentAddress().getState() + "-" + student.getStudentAddress().getZip());		
		
	}
}
