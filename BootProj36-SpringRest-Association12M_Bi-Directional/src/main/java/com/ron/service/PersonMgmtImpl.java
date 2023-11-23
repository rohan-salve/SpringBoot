package com.ron.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ron.model.Person;
import com.ron.model.PhoneNumber;
import com.ron.repo.IPersonRepo;
import com.ron.repo.IPhoneNumberRepo;


@Service
public class PersonMgmtImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo personRepo;
	
	@Autowired
	private IPhoneNumberRepo phoneRepo;
	
	@Override
	public String savePerson(Person person) {
		Integer idValue = personRepo.save(person).getPid();
		return "Person with his phoneNumber is saved with PID :"+idValue;
		
	}

	@Override
	public String savePhoneNumber(Iterable<PhoneNumber> number) {
		for (PhoneNumber phoneNumber : number) {
			phoneRepo.save(phoneNumber);
		}
		return  "no of phoneNumbers are saved ->"+ ((Set<PhoneNumber>)number).size();
	}

	@Override
	public Iterable<Person> fetchByPerson() {
		
		return personRepo.findAll();
	}

	@Override
	public Iterable<PhoneNumber> fetchByPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneRepo.findAll();
	}

	@Override
	public String deleteByPersonId(int personId) {
		Optional<Person> optional = personRepo.findById(personId);
		if (optional.isPresent())
		{
			personRepo.delete(optional.get());
			return "Person and his phone number is deleted";
		}
		return "Person not found";
	}

	@Override
	public String deleteAllPhoneNumbersOfPerson(int personId) {
		
		Optional<Person> optional =  personRepo.findById(personId);
		if(optional.isPresent())
		{
			Set<PhoneNumber> phoneNumbers = optional.get().getContactDetails();
			phoneNumbers.forEach(child ->{
				child.setPerson(null);	
			});

			phoneRepo.deleteAll(phoneNumbers);
			phoneRepo.deleteAll(phoneNumbers);
			return "Person's phone number records deleted Successfully ";
		}
		return "Person not found";
	}

	

}
