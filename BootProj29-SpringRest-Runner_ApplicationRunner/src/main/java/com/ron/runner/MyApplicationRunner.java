package com.ron.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Value("${some.sample.string}")
	private String value ;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("MyApplicationRunner.run()");
		System.out.println(Arrays.asList(args.getSourceArgs()));
		System.out.println("*******************************");

		System.out.println("***NON OPTIOANL ARGS****");
		System.out.println(Arrays.asList(args.getNonOptionArgs()));
		System.out.println("***OPTIOANL ARGS****");
		System.out.println(Arrays.asList(args.getOptionNames()));
		
		Set<String> optionNames = args.getOptionNames();
		for (String optionName : optionNames) {
			System.out.println(optionName +"::"+args.getOptionValues(optionName));
		}
		System.out.println("*******************************");
		
		if (args.getNonOptionArgs().contains("start")) {
			System.out.println("Sending Mails to Test Application Functionality");
		}
		System.out.println("*******************************");
		
		System.out.println(value);
		System.out.println("*******************************");
		
		System.out.println("******** VIA LAMBDA EXPRESSION");
		
	}

}
