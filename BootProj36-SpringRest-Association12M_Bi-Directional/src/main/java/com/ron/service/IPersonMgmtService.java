package com.ron.service;


import com.ron.model.Person;
import com.ron.model.PhoneNumber;


public interface IPersonMgmtService {
	public String savePerson(Person person);
	public String savePhoneNumber(Iterable<PhoneNumber> number);
	public Iterable<Person> fetchByPerson();
	public Iterable<PhoneNumber> fetchByPhoneNumber();
	public String deleteByPersonId(int personId);
	public String deleteAllPhoneNumbersOfPerson(int personId);
	
}
