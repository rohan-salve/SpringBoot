package com.ron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.response.CurrencyResponse;

@RestController
@RequestMapping("/api/currency")
public class CurrencyConverterApp {

	@GetMapping("/getCurrencyExchangeCost/from/{from}/to/{to}")
	public ResponseEntity<CurrencyResponse> getCurrencyValue(@PathVariable String from ,@PathVariable String to)
	{
		
		CurrencyResponse currencyResponse = new CurrencyResponse();
		
		currencyResponse.setCurrencyId(1);
		currencyResponse.setFrom(from);
		currencyResponse.setTo(to);
		currencyResponse.setCurrencyValue(83);
		return new ResponseEntity<CurrencyResponse>(currencyResponse,HttpStatus.OK);
		
	}
}

