package com.ron.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MySecondRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MySecondRunner.run()");

		System.out.println(""+args[1]);
		System.out.println("*******************************");

	}

}
