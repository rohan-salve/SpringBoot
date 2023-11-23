package com.ron.model;

import lombok.Data;

@Data
public class Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	private Boolean active;
	private Address address;
	private String[] language;
}
