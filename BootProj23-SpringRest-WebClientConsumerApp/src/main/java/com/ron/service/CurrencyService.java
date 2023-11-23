package com.ron.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ron.response.CurrencyResponse;

@Service("service")
public class CurrencyService {
	private static final String REST_END_POINT = "http://localhost:8080/BootProj22-SpringRest-WebClientCurrencyProvider/api/currency/getCurrencyExchangeCost/from/{from}/to/{to}";

	public void invokeRestApiSync(String from, String to)
	{
		//sending synchronous request
		WebClient webClient = WebClient.create();
		System.out.println("CurrencyService.invokeRestApiSync()");
		System.out.println("***Synchronous call started******");
		 CurrencyResponse currencyResponse = webClient.get()
				 							.uri(REST_END_POINT, from,to)
				 							.retrieve()
				 							.bodyToMono(CurrencyResponse.class)
				 							.block();
		 
		 System.out.println(currencyResponse);
		 System.out.println("***Synchronous call Ended*******");
	}
	
	public void invokeRestApiASync(String from, String to)
	{
		//sending synchronous request
		WebClient webClient = WebClient.create();
		System.out.println("CurrencyService.invokeRestApiSync()");
		System.out.println("***ASynchronous Restcall started******");
		 webClient.get()
				 							.uri(REST_END_POINT, from,to)
				 							.retrieve()
				 							.bodyToMono(CurrencyResponse.class)
				 							.subscribe(CurrencyService::myResponse);
		 
		 System.out.println("***Synchronous Restcall Ended*******");
	}

	private static void myResponse(CurrencyResponse response) {
		System.out.println(response);
	}
}
