package com.ron.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ron.model.Person;
import com.ron.model.PhoneNumber;
import com.ron.repo.IPersonRepo;
import com.ron.repo.IPhoneNumberRepo;


@Service
public class PersonMgmtImpl implements IPersonMgmtService {

	@Autowired
	private IPersonRepo personRepo;
	
	@Autowired
	private IPhoneNumberRepo phoneRepo;

	@Override
	public List<Object[]> fetchDataByJoinsusingParent() {
		// TODO Auto-generated method stub
		return personRepo.fetchDataUsingJoinsByParent();
	}
	
	
}
