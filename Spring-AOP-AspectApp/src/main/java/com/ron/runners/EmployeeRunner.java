package com.ron.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ron.dao.EmployeeDao;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public void run(String... args) throws Exception {
		dao.saveEmployee();
		System.out.println();
		dao.getEmployee();
		System.out.println();
		dao.deleteEmployee();
		
	}

	
}
