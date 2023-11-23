package com.ron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ron.dao.ITouristRepo;
import com.ron.exception.TouristNotFoundException;
import com.ron.model.Tourist;

@Service
public class TouristMgmtService implements ITouristMgmtService {

	@Autowired
	private ITouristRepo repo;

	@Override
	public String registerTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		Integer tid = repo.save(tourist).getTid();

		return "Tourist registered with Id  ::  " + tid;
	}

	@Override
	public List<Tourist> fetchAllTourist() {
		// TODO Auto-generated method stub

		List<Tourist> list = repo.findAll();
		list.sort((t1, t2) -> t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fecthTouristById(Integer id) {

		/*
		 * Optional<Tourist> optional = repo.findById(id); if (optional.isPresent()) {
		 * return optional.get(); } else { throw new
		 * TouristNotFoundException("Tourist not found with id :: "+id); }
		 */

		return repo.findById(id).orElseThrow(() -> new TouristNotFoundException("Tourist not found with id :: " + id));
	}

	@Override
	public String updateTouristByDetails(Tourist tourist) {
		// TODO Auto-generated method stub
		Optional<Tourist> optional = repo.findById(tourist.getTid());
		if (optional.isPresent()) {
			repo.save(tourist);
			return "Tourist with id : "+tourist.getTid()+" is updated successfully";
		} else {
			throw new TouristNotFoundException("Tourist not found with Id : "+tourist.getTid()+" to update");
		}

	}

	@Override
	public String updateTouristBudgetById(Integer id, Float percentHike) {
		Optional<Tourist> optional = repo.findById(id);
		if (optional.isPresent()) {
			Tourist tourist = optional.get();
			tourist.setBudget(tourist.getBudget()+(tourist.getBudget()*(percentHike/100)));
			repo.save(tourist);	
			return "Tourist with id : "+tourist.getTid()+" is updated successfully";
		} else {
			throw new TouristNotFoundException("Tourist not found with Id : "+id+" to update");
		}
		
	}

	@Override
	public String deleteTouristById(Integer id) {

		Optional<Tourist> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.deleteById(id);
			return "Record with id :: "+id +" is deleted successfully..";
		} else {
			throw new TouristNotFoundException("Tourist with id :"+id +" is not present to delete");
		}
	}

	


}
