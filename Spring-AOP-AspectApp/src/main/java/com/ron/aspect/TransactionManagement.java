package com.ron.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {
	
	
	
	//@Pointcut("execution(public void com.ron.dao.EmployeeDao.saveEmployee())"	
	//@Pointcut("execution(public * com.ron.dao.*.saveEmployee())")
	@Pointcut("execution (public * com.ron.dao.*.saveEmployee())")
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
	
	

	//@Before("p1() && p2()")
	@Before("p1()")
	public void beginTransaction()
	{
		System.out.println("Transaction Began...");
	}

	//@After("p1() && p2()")
	@After("p1()")
	public void commitTransaction()
	{
		System.out.println("Transaction Committed..");
	}
	@Before("p3()")
	public void searchingRecords()
	{
		System.out.println("Searching Began...");
	}
	@After("p3()")
	public void fecthingRecordDetails()
	{
		System.out.println("Record Found..");
	}
	
	
}
