package com.ron;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ron.config.model.customer.Customer;
import com.ron.config.model.product.Product;
import com.ron.repo.customer.ICustomerRepo;
import com.ron.repo.product.IProductRepo;

@SpringBootApplication
public class BootProj35SpringRestMultiDbConfigApplication implements CommandLineRunner{

	@Autowired
	private IProductRepo productRepo;
	
	@Autowired
	private ICustomerRepo customerRepo;
	
	public void run(String... args) throws Exception
	{
		productRepo.saveAll(
				Arrays.asList(
						new Product (10,"C-001","Fossil"),
						new Product (11,"C-002","Armani"),
						new Product (12,"C-003","Tissot")
						)
				);
		
		customerRepo.saveAll(
				Arrays.asList(
						new Customer (10,"ron","ron@gmail.com"),
						new Customer (11,"john","john@gmail.com"),
						new Customer (12,"non","non@gmail.com")
						)
				);
		
		System.out.println("we are in RUN METHOD");
		
	}
	public static void main(String[] args) {
		SpringApplication.run(BootProj35SpringRestMultiDbConfigApplication.class, args);
	
	
	}
	
	
}
