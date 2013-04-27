package com.kairos.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class SpringHibernateUserDAOTest extends TestCase {

	private SpringHibernateUserDAO userDAO;
	@Override
	protected void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kairos/spring/hibernate/spring-hibernate.xml");
		userDAO = (SpringHibernateUserDAO)context.getBean("springHibernateDAO");
	}
	public void testGetUser() {
		
		User user = userDAO.getUser("Padmini");
		assertEquals("123hello", user.getPassword());
		
	}

	public void testCreateUser() {
		User user = new com.kairos.spring.hibernate.User();
		user.setUsername("junit");
		user.setPassword("hello");
		user.setFirstname("JUNIT");
		user.setLastname("Hello");
	}

	public void testDeleteUser() {
		fail("Not yet implemented");
	}

	public void testGetUserByUNP() {
		fail("Not yet implemented");
	}

}
