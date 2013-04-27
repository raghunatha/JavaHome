package com.java.spring.hibernate;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SpringHibernateUserDAO extends HibernateDaoSupport{
	
	//R
	public User getUser(String username){
		
		return getHibernateTemplate().get(User.class, username);
	}
	
	//C
	
	public void createUser(User user){
		
		getHibernateTemplate().saveOrUpdate(user);
	}
	
	//D
	
	public void deleteUser(String username){
		
		User deleteUser = getUser(username);
		
		getHibernateTemplate().delete(deleteUser);
		
	}
	
	public List<User> getAllUsers(){
		
		List<User> user = getHibernateTemplate().find("from User");
		
		return user;
	}
	
	public User getUserByUNP(String username,String password){
		
		return (User) getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(User.class).add(Restrictions.eq("username", username))).get(0);
	}

}
