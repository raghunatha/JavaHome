package com.kairos.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateUserDAOT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/hibernate/spring-hibernate.xml");
		SpringHibernateUserDAO dao = (SpringHibernateUserDAO)context.getBean("springHibernateDAO");

		User user = dao.getUserByUNP("Padmini", "123hello");//dao.getUser("Padmini");
		System.out.println(user.getUsername()+" : "+user.getPassword()+" : "+user.getFirstname()+" : "+user.getLastname());
	}

}
