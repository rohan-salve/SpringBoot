package com.ron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("/info/{id}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id)
	{
		String body =null;
		
		if (id == 1) {
			body = "JAVA by ROHAN";
		}
		else {
			body = "DevOps by JD";
		}
		System.out.println(body);
		ResponseEntity<String> entity =new ResponseEntity<String>(body,HttpStatus.OK);
		return entity;
	}
	@GetMapping("/info/{id}/name/{name}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id, @PathVariable String name)
	{
		String body =null;
		
		if (id == 1 && name.equalsIgnoreCase("rohan")) {
			body = "JAVA by ROHAN";
		}
		else {
			body = "DevOps by JD";
		}
		System.out.println(body);
		ResponseEntity<String> entity =new ResponseEntity<String>(body,HttpStatus.OK);
		return entity;
	}
}
