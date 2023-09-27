package com.ron.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public String saveEmployee()
	{
		/*
		 * if (new Random().nextInt(15) < 10) { throw new
		 * RuntimeException("DUMMY EXCEPTION"); }
		 */
		
		System.out.println("Record Saved...");
		return "Employeee data is saved in Return";
	}
	
}
