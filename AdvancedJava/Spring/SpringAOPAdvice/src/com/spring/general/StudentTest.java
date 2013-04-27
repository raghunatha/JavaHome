package com.spring.general;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/general/spring-student.xml", "com/spring/general/spring-address.xml"});*/
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/general/spring-all-configFiles.xml"});
		
		Student student = (Student)applicationContext.getBean("studentBean");
		
		//The below student object call will not inject Address object in to Student Object
		/*Student student = (Student)applicationContext.getBean("simpleStudentBean");*/
		
		System.out.println(student.getStudentId());
		System.out.println(student.getAddressObject().getAddressId());
	}
}
