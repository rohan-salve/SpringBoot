package com.ron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ron.entity.StockPrice;
import com.ron.exception.StockNotFoundException;
import com.ron.repository.StockRepo;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private StockRepo repo;
	
	@Override
	public Double findByComapanyName(String companyName) {
		
		StockPrice stockPrice = repo.findByCompanyName(companyName);
		
		if(stockPrice == null)
		{
			throw new StockNotFoundException("COMAPNY NOT FOUND");
		}
		
		return stockPrice.getCompanyPrice();
	}

}
