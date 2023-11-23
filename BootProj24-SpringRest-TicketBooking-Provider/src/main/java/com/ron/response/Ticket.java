
package com.ron.response;

import lombok.Data;

@Data
public class Ticket {

	private Integer tikcetId;
	private String  tikcetStatus;
	private Double ticketPrice;
	private String passengerName;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
}
