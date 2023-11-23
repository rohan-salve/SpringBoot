package com.ron.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

	private Integer id;
	private String name;
	private Float age;
	private String type;
	
}
