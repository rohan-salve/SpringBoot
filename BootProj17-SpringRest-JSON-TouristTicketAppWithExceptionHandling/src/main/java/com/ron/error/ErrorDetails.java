package com.ron.error;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDetails {

	private LocalDateTime ldt;
	private String msg;
	private String status;
}
