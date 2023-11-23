package com.ron.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		RestTemplate template =  new RestTemplate();
		String serviceUrl = "http://localhost:8080/BootProj19-SpringRest-ProviderApp/api/actor/wish";
		
		ResponseEntity<String> responseEntity = template.getForEntity(serviceUrl, String.class);

		System.out.println("Response Body			::"+ responseEntity.getBody());
		System.out.println("Response Status Value	::"+ responseEntity.getStatusCodeValue());
		System.out.println("Response Code			::"+ responseEntity.getStatusCode().name());

		System.out.println("ActorServiceConsumingRunner.run()");
	}

}
