package com.ron.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public int saveEmployee()
	{
		System.out.println("Record Saved...");
		return 10;
	}
	
}
