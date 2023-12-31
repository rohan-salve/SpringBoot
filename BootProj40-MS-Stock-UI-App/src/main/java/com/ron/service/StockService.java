package com.ron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockService {

	public String getTotalStockPrice(String companyName, Integer quantity)
	{
		String REST_END_POINT = "http://localhost:1111/api/calc/calculate/{companyName}/{quantity}";
		String response = null;
		
		WebClient webLCient = WebClient.create();
		
		try {
			response = webLCient.get().uri(REST_END_POINT,companyName,quantity)
							.retrieve()
							.bodyToMono(String.class)
							.block();
		} catch (Exception e) {
			response = "Company NOT FOUND!!";
		}
		
		return response;
	}
	
}
