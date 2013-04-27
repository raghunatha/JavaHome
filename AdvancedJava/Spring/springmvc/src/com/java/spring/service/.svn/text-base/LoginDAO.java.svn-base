package com.java.spring.service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class LoginDAO extends HibernateDaoSupport{
	
	public Users getUser(String username){
		
		return getHibernateTemplate().get(Users.class, username);
	}

}
