package com.ron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ron.dao.ICustomerDAO;
import com.ron.model.Customer;


@Service
public class CustomerSerivceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDAO repo;

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) repo.findAll();
	}
	
	public void saveCustomer(Customer customer) {
		repo.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		Optional<Customer> optional =  repo.findById(customerId);
		
		return optional.get();
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		repo.deleteById(customerId);
		
	}

}
