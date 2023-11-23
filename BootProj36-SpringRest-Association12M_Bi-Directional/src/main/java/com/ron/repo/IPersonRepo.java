package com.ron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ron.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
