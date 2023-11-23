package com.ron.repo.customer;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ron.config.model.customer.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

	

}
