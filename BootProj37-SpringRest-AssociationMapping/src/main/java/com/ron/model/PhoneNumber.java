package com.ron.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regNo;
	
	@NonNull
	private Long phoneNo;
	@NonNull
	private String provider;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)//, fetch = FetchType.LAZY)
	private Person person;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNo=" + phoneNo + ", provider=" + provider
				+ "]";
	}
	
	
}
