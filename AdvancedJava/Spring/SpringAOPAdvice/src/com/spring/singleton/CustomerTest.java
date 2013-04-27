package com.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/singleton/spring-customer.xml" });
 
		CustomerService customer1 = (CustomerService) appContext.getBean("customerService"); 
		customer1.setName("Raghu");
		System.out.println("Customer 1 name : " + customer1.getName());
		
		CustomerService customer2 = (CustomerService) appContext.getBean("customerService"); 
		System.out.println("Customer 2 name : " + customer2.getName());
		
	}
}