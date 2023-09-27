package com.ron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/read")
	public ResponseEntity<String> getEmployee(@RequestParam Integer id, @RequestParam String name)
	{
		String body = null;
		
		if (id == 7 && name.equalsIgnoreCase("dhoni")) {
			body = "CSK";
		}
		else {
			body = "MI";
		}
		System.out.println("Customer Found with the id :: "+id+ " and name is "+name +" belongs to "+body);
		return new ResponseEntity<String>("Customer Found with the id :: "+id + " and name is "+name +" belongs to "+body,HttpStatus.OK);
	}
}
