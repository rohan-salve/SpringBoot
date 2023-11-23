package com.ron.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ron.model.Person;
import com.ron.model.PhoneNumber;
import com.ron.service.IPersonMgmtService;

@Component
public class AssociationRunner implements CommandLineRunner {

	@Autowired
	private IPersonMgmtService service;

	@Override
	public void run(String... args) throws Exception {

		//SAVE PARENT to CHILD
		
		
		  Person person = new Person("RON", "PUNE"); PhoneNumber p1 = new
		  PhoneNumber(88888888L, "airtel"); PhoneNumber p2 = new PhoneNumber(99999999L,
		  "jio"); p1.setPerson(person); p2.setPerson(person); Set<PhoneNumber>
		  contactDetails = Set.of(p1, p2); person.setContactDetails(contactDetails);
		  System.out.println(service.savePerson(person));
		 
		   
		  
		//SAVE CHILD to PARENT
		
		/*
		 * PhoneNumber p3=new PhoneNumber(777777777L, "airtel"); PhoneNumber p4=new
		 * PhoneNumber(666666666L, "jio"); Person person1 = new Person("NON", "LONDON");
		 * p3.setPerson(person1); p4.setPerson(person1); Set<PhoneNumber>
		 * contactDetails1 = Set.of(p3, p4); person1.setContactDetails(contactDetails1);
		 * System.out.println(service.savePhoneNumber(contactDetails1));
		 */
		 
		  //Loading Parent to Child
			
			
			/*
			 * service.fetchByPerson().forEach(person ->{
			 * System.out.println("PARENT ::"+person); Set<PhoneNumber> childs =
			 * person.getContactDetails(); childs.forEach(contact
			 * ->{System.out.println("CHILD  ::"+contact);}); });
			 */
			 
		
		
		//Loading CHILD to PARENT
		
		
		/*
		 * service.fetchByPhoneNumber().forEach(phone ->{
		 * System.out.println("CHILD  ::"+phone);
		 * System.out.println("PARENT ::"+phone.getPerson()); });
		 */
		 
		 
		//Delete Person by ID
		//System.out.println(service.deleteByPersonId(1));
		
		//Delete Person's Phone numbers
		//System.out.println(service.deleteAllPhoneNumbersOfPerson(2));
		
		
		

	}

}
