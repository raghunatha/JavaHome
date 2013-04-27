package com.spring.aop.pointcutandadvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/aop/pointcutandadvisor/spring-customer.xml" });
 
		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
 
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {
			System.out.println("caught the exception from CustomerService class");
			System.out.println("*************************");
		}
 
	}
}