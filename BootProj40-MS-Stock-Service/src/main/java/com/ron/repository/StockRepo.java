package com.ron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ron.entity.StockPrice;
import java.util.List;


public interface StockRepo extends JpaRepository<StockPrice, Integer> {

	public StockPrice  findByCompanyName(String companyName);
}
