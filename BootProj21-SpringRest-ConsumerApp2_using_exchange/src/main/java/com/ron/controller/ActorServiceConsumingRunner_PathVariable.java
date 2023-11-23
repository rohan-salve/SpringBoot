package com.ron.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner_PathVariable implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("ActorServiceConsumingRunner_PathVariable.run()");
		RestTemplate template =  new RestTemplate();
		String serviceUrl = "http://localhost:8080/BootProj19-SpringRest-ProviderApp/api/actor/wish/{id}/{name}";
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("id", 7);
		map.put("name", "Rohan");
		
		ResponseEntity<String> responseEntity = template.exchange(serviceUrl, HttpMethod.GET, null, String.class, 7,"Rohan");

		System.out.println("Response Body			::"+ responseEntity.getBody());
		System.out.println("Response Status Value	::"+ responseEntity.getStatusCodeValue());
		System.out.println("Response Code			::"+ responseEntity.getStatusCode().name());
		System.out.println("********************************************************************");

	}

}
