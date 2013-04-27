package com.kairos.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/core/beans.xml");
		
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");

		hello.sayHello();
	}

}
