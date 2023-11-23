package com.ron.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ron.model.Actor;

@Component
public class ActorServiceConsumingRunner_GettingJSONData implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("ActorServiceConsumingRunner_GettingJSONData.run()");
		RestTemplate template =  new RestTemplate();
		String serviceUrl = "http://localhost:8080/BootProj19-SpringRest-ProviderApp/api/actor/find/{id}";
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("id",7);
				
		ResponseEntity<Actor> responseEntity = template.getForEntity(serviceUrl, Actor.class,map);

		System.out.println("Response Body			::"+ responseEntity.getBody());
		System.out.println("Response Status Value	::"+ responseEntity.getStatusCodeValue());
		System.out.println("Response Code			::"+ responseEntity.getStatusCode().name());

	}

}
