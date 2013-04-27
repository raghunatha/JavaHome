package com.spring.dependencyChecking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/dependencyChecking/Beans.xml" });

		Customer customer = (Customer) applicationContext
				.getBean("customerBean");
	}
}
