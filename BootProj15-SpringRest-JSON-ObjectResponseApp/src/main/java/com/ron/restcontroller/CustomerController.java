package com.ron.restcontroller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.model.Company;
import com.ron.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@GetMapping("/report/{id}")
	public ResponseEntity<Customer> showAllCustomer(@PathVariable Integer id)
	{
		System.out.println("Customer data for the id :"+id);
		Customer customer = new Customer();
		customer.setNo(id);
		customer.setName("rohan");
		customer.setBillAmount(999.0f);
		customer.setTeamNames(new String[] {"IND, RCB"});
		customer.setStudies(List.of("JAVA","C#"));
		customer.setPhoneNumbers(Set.of(1111222233L,4444555566L));
		customer.setIdDetails(Map.of("adhar",90909090909L,"pan","abcd00e1234"));
		customer.setCompanyDetails(new Company("RCB","IPL","PUNE",12));
		
		ResponseEntity<Customer> entity = new ResponseEntity<Customer>(customer, HttpStatus.OK);
		return entity;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer)
	{
		System.out.println(customer);
		Integer id = 10;
		String body  = "customer registered with id "+id;
		ResponseEntity<String> entity = new ResponseEntity<String>(body,HttpStatus.OK);
		
		return entity;
		
	}
		
	
}
