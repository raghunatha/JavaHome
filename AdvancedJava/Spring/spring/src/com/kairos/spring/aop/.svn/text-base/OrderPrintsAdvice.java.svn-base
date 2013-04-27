package com.kairos.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class OrderPrintsAdvice implements AfterReturningAdvice {

	private CafeOwner cafeOwner;
public CafeOwner getCafeOwner() {
		return cafeOwner;
	}
	public void setCafeOwner(CafeOwner cafeOwner) {
		this.cafeOwner = cafeOwner;
	}
@Override
public void afterReturning(Object obj, Method method, Object[] aobj,
		Object obj1) throws Throwable {

	getCafeOwner().countPritns();
	getCafeOwner().issueBill();
}
}
