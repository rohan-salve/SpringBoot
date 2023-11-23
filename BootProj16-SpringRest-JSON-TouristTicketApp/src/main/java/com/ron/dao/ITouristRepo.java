package com.ron.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ron.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer>{

	
}
