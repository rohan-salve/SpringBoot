package com.ron.dao;

import org.springframework.data.repository.CrudRepository;

import com.ron.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}
