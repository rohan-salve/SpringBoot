package com.ron.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public void saveEmployee()
	{
		System.out.println("Record Saved...");
	}
	
	public void getEmployee() {
		System.out.println("Employee Retrived..");
	}
	
	public String deleteEmployee() {
		return "Employee Deleted..";
	}
}
