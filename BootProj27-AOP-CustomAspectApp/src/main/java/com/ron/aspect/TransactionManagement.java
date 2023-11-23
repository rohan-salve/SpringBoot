package com.ron.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {
	

	@Pointcut("@annotation (in.ron.annotation.MyTransaction)")
	public void p1()
	{
		
	}
	
	
	@Before("p1()")
	public void beforeAdvice()
	{
		System.out.println("Before Transaction ...");
		
		
	}
	
	@After("p1()")
	public void afterAdvice()
	{
		
		System.out.println("After Transaction ...");
	}
	
	
}
