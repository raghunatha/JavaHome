package com.kairos.spring.hibernate;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SpringHibernateEmployeeDAO extends HibernateDaoSupport{
	
	
	public Employee getEmployee(int empId){
	
		return getHibernateTemplate().get(Employee.class, empId);
	}
	
}
