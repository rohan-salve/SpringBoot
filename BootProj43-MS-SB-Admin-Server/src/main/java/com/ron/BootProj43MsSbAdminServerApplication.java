package com.ron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class BootProj43MsSbAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj43MsSbAdminServerApplication.class, args);
	}

}
