package com.ron.controller;


import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner_RequestBody implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("ActorServiceConsumingRunner_RequestBody.run()");
		
		RestTemplate template =  new RestTemplate();
		String serviceUrl = "http://localhost:8080/BootProj19-SpringRest-ProviderApp/api/actor/register";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String json_body = "{\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"name\": \"rohan\",\r\n"
				+ "    \"type\": \"2days 3nights\",\r\n"
				+ "    \"age\": 5000.0\r\n"
				+ "}";
		
		HttpEntity<String> request = new HttpEntity<String>(json_body, headers);
				
		ResponseEntity<String> responseEntity = template.postForEntity(serviceUrl, request, String.class);

		System.out.println("Response Body			::"+ responseEntity.getBody());
		System.out.println("Response Status Value	::"+ responseEntity.getStatusCodeValue());
		System.out.println("Response Code			::"+ responseEntity.getStatusCode().name());

	}

}
