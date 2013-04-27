package com.spring.lazyInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {
	public static void main(String args[]) {
		// Initializing context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/lazyInitialization/spring-employee.xml" });
		System.out.println("***************After initialization***************");
		applicationContext.getBean("addressBean");
	}
}
