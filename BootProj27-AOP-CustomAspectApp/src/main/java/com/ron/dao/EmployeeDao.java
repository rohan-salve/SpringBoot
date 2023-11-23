package com.ron.dao;


import org.springframework.stereotype.Component;

import in.ron.annotation.MyTransaction;

@Component
public class EmployeeDao {

	@MyTransaction
	public void saveEmployee()
	{
		System.out.println("Record Saved...");
		
	}
	
}
