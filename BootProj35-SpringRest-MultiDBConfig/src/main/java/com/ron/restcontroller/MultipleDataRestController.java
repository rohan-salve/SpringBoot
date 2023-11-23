package com.ron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.config.model.customer.Customer;
import com.ron.config.model.product.Product;
import com.ron.repo.customer.ICustomerRepo;
import com.ron.repo.product.IProductRepo;

@RestController
@RequestMapping("/api")
public class MultipleDataRestController {

	@Autowired
	private ICustomerRepo customerRepo;
	
	@Autowired
	private IProductRepo productRepo;

	@GetMapping("/allProducts")
	public List<Product> findAllProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/allCustomers")
	public List<Customer> findAllCustomers(){
		return customerRepo.findAll();
	}
}