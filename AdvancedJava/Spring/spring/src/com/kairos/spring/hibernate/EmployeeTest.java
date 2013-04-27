package com.kairos.spring.hibernate;

import java.util.HashSet;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/hibernate/spring-hibernate.xml");
		SpringHibernateEmployeeDAO empDao = (SpringHibernateEmployeeDAO)context.getBean("employeeDAO");
		
		Employee emp = empDao.getEmployee(4);
		
		System.out.println(emp.getEmpName());
		
		for(Address addr:emp.getAddresses()){
			System.out.println(addr.getAddress());
		}
	
	}
}
