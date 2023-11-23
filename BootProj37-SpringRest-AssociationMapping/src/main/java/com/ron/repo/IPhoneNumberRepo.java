package com.ron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ron.model.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
