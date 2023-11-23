package com.ron.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ron.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

	@Query("select p.pid, p.pname, p.paddress, ph.regNo, ph.phoneNo, ph.provider from Person p  inner join p.contactDetails ph  ")
	//@Query("select p.pid, p.pname, p.paddress, ph.regNo, ph.phoneNo, ph.provider from Person p  left join p.contactDetails ph  ")
	//@Query("select p.pid, p.pname, p.paddress, ph.regNo, ph.phoneNo, ph.provider from Person p  right join p.contactDetails ph  ")
	//@Query("select p.pid, p.pname, p.paddress, ph.regNo, ph.phoneNo, ph.provider from Person p  full join p.contactDetails ph  ")
	public List<Object[]> fetchDataUsingJoinsByParent();
}
