package com.ron.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class MyCmdLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyRunner.run()");
		System.out.println(Arrays.asList(args));
		System.out.println("*******************************");
	

		System.out.println("******** VIA LAMBDA EXPRESSION");
		

	}

}
