package com.java.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressTest {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/java/ioc/SpringBeans.xml");
		Address address = (Address)appContext.getBean("address");	
		
		System.out.println(address.getLine1() + ", " + address.getLine2());
		System.out.println(address.getCity() + ", " + address.getState() + "-" +address.getZip());
		
	}
}
