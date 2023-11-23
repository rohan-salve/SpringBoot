package com.ron.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ron.model.Person;
import com.ron.model.PhoneNumber;
import com.ron.service.IPersonMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		service.fetchDataByJoinsusingParent().forEach(row->{
			for(Object obj: row) {
				System.out.print(obj+" ");
			}
			System.out.println();
		});
	}

}
