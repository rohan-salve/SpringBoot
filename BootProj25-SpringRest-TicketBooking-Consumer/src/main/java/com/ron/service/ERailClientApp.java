package com.ron.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ron.request.Passenger;
import com.ron.response.Ticket;

@Service("service")
public class ERailClientApp {

	private static final String REST_END_URL = "http://localhost:8080/BootProj24-SpringRest-TicketBooking-Provider/api/tikcet/register";
	
	public void invokeRestApi() {
		WebClient client = WebClient.create();
		
		Passenger body = new Passenger();
		body.setFirstName("Rohan");
		body.setLastName("Salve");
		body.setJourneyDate("20-6-12");
		body.setFrom("PUNE");
		body.setTo("BANGLORE");
		body.setTrainNumber("12345");
		Ticket response =  client.post()
							.uri(REST_END_URL)
							.body(BodyInserters.fromValue(body))
							.retrieve()
							.bodyToMono(Ticket.class)
							.block();
		System.out.println(response);
		
	}
}
