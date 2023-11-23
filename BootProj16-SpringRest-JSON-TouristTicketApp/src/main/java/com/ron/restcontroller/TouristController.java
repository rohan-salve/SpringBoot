package com.ron.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.model.Tourist;
import com.ron.service.ITouristMgmtService;

@RestController
@RequestMapping	("/api/tourist")
public class TouristController {
	
	@Autowired
	private ITouristMgmtService service;	

	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist (@RequestBody Tourist tourist)
	{ try {
		String resultMsg = service.registerTourist(tourist);
		return new ResponseEntity<String>(resultMsg,HttpStatus.OK);	
	} catch (Exception e) {
		return new ResponseEntity<String>("Problem in tourist enrollment",HttpStatus.INTERNAL_SERVER_ERROR);
		// TODO: handle exception
	}
	}

	@GetMapping("/findAll")
	public ResponseEntity<?> displayTouristDetails()
	{
		try {
			List<Tourist> list = service.fetchAllTourist();
			return new ResponseEntity<List>(list,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>("Error in Listing all Tourist", HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id)
	{
		try {
			Tourist tourist = service.fecthTouristById(id);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping("/modify")
	public ResponseEntity<String> modifyTourist(@RequestBody Tourist tourist)
	{
	try {
		String msg = service.updateTouristByDetails(tourist);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}	
	}	
	
	@PatchMapping("/budgetModify/{id}/{percentHike}")
	public ResponseEntity<String> modifyTouristBudgetById(@PathVariable("id") Integer id , @PathVariable Float percentHike)
	{
	try {
		String msg = service.updateTouristBudgetById(id,percentHike);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTouristById(@PathVariable("id") Integer id)
	{
		try {
			String msg = service.deleteTouristById(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
