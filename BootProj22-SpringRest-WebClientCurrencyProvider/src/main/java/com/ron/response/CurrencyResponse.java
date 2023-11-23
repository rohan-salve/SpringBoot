package com.ron.response;

import lombok.Data;

@Data
public class CurrencyResponse {

	private Integer currencyId ;
	private String from;
	private String to;
	private Integer currencyValue;
}
