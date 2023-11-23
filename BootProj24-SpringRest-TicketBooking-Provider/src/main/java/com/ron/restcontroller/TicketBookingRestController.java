package com.ron.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ron.request.Passenger;
import com.ron.response.Ticket;

@RestController
@RequestMapping("/api/tikcet")
public class TicketBookingRestController {

	@PostMapping("/register")
	public ResponseEntity<Ticket> bookTikcet(@RequestBody Passenger passenger) {
		Ticket ticket = new Ticket();
		ticket.setTikcetId(123);
		ticket.setTikcetStatus("BOOKED");
		ticket.setTicketPrice(400.0);
		ticket.setPassengerName(passenger.getFirstName()+" "+passenger.getLastName());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setJourneyDate(passenger.getJourneyDate());
		ticket.setTrainNumber(passenger.getTrainNumber());
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
}
