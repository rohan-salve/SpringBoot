package com.ron.restcontroller;

import java.net.http.HttpResponse;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.client.StockClient;
@RestController
@RequestMapping("/api/calc")
public class StockCalculationRestController {
	@Autowired
	private StockClient client;
	
	
	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calculate(@PathVariable String companyName, @PathVariable Double quantity)
	{
		
		
		ResponseEntity<?> responseEntity = null;
		Double totalPrice = null;
		
		System.out.println(companyName);
		System.out.println(quantity);
		try {
			responseEntity= client.getStockPrice(companyName);
			
			System.out.println(responseEntity);
			
			int statusCode = responseEntity.getStatusCodeValue();
			if (statusCode == 200)
			{
				Double companyStockPrice = (Double) responseEntity.getBody();
				totalPrice = quantity * companyStockPrice;
				String response = "Total Cost :: "+ totalPrice;
				responseEntity = new ResponseEntity<String>(response, HttpStatus.OK);
				System.out.println("StockCalculationRestController.calculate()");
			}
			
			
			
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("COMPANY NOT FOUND", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}
}
