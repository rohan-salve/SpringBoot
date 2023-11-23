package com.ron.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name)
	{
		String hieeMsg = "Hello";
		return hieeMsg + " "+name + " how r u?";
	}
}
