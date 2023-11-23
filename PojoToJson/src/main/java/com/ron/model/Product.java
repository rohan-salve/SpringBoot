package com.ron.model;

import lombok.Data;

@Data
public class Product {

	private Integer id;
	private String pname;
	private Double price;
	private String [] type;	
}
