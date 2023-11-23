package com.ron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ron.client.HelloClient;

@RestController
public class HiRestController {
	
	@Autowired
	private HelloClient client;
	
	
	@GetMapping("/hi/{name}")
	public String sayHiee(@PathVariable String name)
	{
		System.out.println("Implementation class name is :: "+client.getClass().getName());
		
		String hieeMsg = "Hiee";
		String helloMsg = client.invokeHelloService(name);
		return hieeMsg + "---"+helloMsg+" "+name + " how r u?";
		
	}
}
