package com.java.spring.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class InternetAdvice implements MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor,ThrowsAdvice{

	private CafeOwner cafeOwner;
	public CafeOwner getCafeOwner() {
		return cafeOwner;
	}
	public void setCafeOwner(CafeOwner cafeOwner) {
		this.cafeOwner = cafeOwner;
	}
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		
		getCafeOwner().recordLoginTime();
	}
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		
		getCafeOwner().recordLogoutTime();
		getCafeOwner().issueBill();
		
	}
	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		getCafeOwner().allocateSystem();
		method.proceed();
		getCafeOwner().deAllocateSystem();
		
		return null;
	}
	
	public void afterThrowing(Throwable t){
		getCafeOwner().deAllocateSystem();
		getCafeOwner().cancelBill();
	}

}
