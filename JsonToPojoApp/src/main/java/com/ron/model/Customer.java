package com.ron.model;

import lombok.Data;

@Data
public class Customer {

	private Integer id;
	private String firstName;
	private String lastName;
	private Boolean active;
}
