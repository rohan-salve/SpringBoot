package com.ron.restcontroller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wish")
public class WishController {

	@GetMapping("/msg")
	@ResponseBody
	public ResponseEntity<String> generateWishMessage()
	{
		
		LocalDateTime ldt =  LocalDateTime.now();
		int hour = ldt.getHour();
				
		String body = null;
		if(hour<12)
			body= "Good Morning";
		else if (hour < 16) {
			body = "Good Afternoon";
		}
		else if (hour < 20) {
			body = "Good Evening";
		}
		else {
			body = "Good Night";
		}
		
		
		return new ResponseEntity<>(body, HttpStatus.OK);
		
	}
}
