package com.ron.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {
	

	@Pointcut("execution (public * com.ron.dao.EmployeeDao.*())")
	public void p1()
	{
		
	}
	@Pointcut("execution (public * com.ron.dao.*.deleteEmployee())")
	public void p2()
	{
		
	}

	@Pointcut("execution (public * com.ron.dao.*.getEmployee())")
	public void p3()
	{
		
	}
	
	@Before("p1()")
	public void beginTransaction()
	{
		System.out.println("Transaction Began...");
	}


	@AfterReturning(value = "p1()" , returning = "obj")
	public void commitTransaction(Object obj)
	{
		System.out.println("Transaction Committed..");
		System.out.println("Data is :: "+obj);
	}
	@AfterThrowing(value = "p1()" , throwing = "obj")
	public void rollBack(Throwable obj)
	{
		System.out.println("Transaction Rolledback..."+obj.getMessage());
	}
	@After("p1()")
	public void emailSetupCredentials()
	{
		System.out.println("EMAIL has been setuped..");
	}
	
	
}
