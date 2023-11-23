package com.ron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

	private String companyName;
	private String companyType;
	private String companyLocation;
	private Integer companySize;
}
