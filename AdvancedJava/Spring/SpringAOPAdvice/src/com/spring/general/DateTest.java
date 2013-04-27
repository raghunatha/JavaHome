package com.spring.general;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DateTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/general/spring-date1.xml"});
		
		DateManipulation date = (DateManipulation)applicationContext.getBean("dateManipulationBean");
		
		System.out.println(date.getDate().getYear());
	}
}
