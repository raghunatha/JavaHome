package com.spring.wiringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/wiringAnnotations/Beans.xml"});
		
		Customer customer = (Customer)applicationContext.getBean("customerBean");
		
		System.out.println(customer.getAddressObject().getCity());
	}
}
