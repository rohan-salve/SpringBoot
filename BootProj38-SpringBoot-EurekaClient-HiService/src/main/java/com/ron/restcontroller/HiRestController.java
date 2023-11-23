package com.ron.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiRestController {
	
	@GetMapping("/hi/{name}")
	public String sayHiee(@PathVariable String name)
	{
		String hieeMsg = "Hiee";
		return hieeMsg + " "+name + " how r u?";
	}
}
