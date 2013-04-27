package com.kairos.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InternetTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/aop/springAop.xml");

		Customer customer = (Customer)context.getBean("customerProxy");
		customer.orderPrints();
	}

}
