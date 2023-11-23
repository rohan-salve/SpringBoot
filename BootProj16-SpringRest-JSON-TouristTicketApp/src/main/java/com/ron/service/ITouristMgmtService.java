package com.ron.service;

import java.util.List;

import com.ron.model.Tourist;

public interface ITouristMgmtService {
	
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourist();
	public Tourist fecthTouristById(Integer id);
	public String updateTouristByDetails(Tourist tourist);
	public String updateTouristBudgetById(Integer id, Float percentHike);
	public 	String deleteTouristById(Integer id);

}
