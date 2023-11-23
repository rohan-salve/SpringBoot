package com.ron.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/msg")
public class MsgRestController {

	
	@GetMapping("/greet/{name}")
	public String sayHi(String name)
	{
		return "Hello "+name ;
	}
	
}
