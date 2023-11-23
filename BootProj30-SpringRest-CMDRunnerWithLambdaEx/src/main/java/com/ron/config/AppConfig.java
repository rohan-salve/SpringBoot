package com.ron.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ron.methodref.MethodTest;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cmdRun() {
		
		return MethodTest::test;
		
		//syntax : Interface obj = (params) -> {MethodBody;}
		/*
		 * return (args)-> { System.out.println("Hello "+Arrays.asList(args)); };
		 */
		
		/*
		 * CommandLineRunner crun = (args)-> {
		 * System.out.println("Hello "+Arrays.asList(args)); }; return crun;
		 */
		
		/*
		 * return new CommandLineRunner() {
		 * 
		 * @Override public void run(String... args) throws Exception {
		 * System.out.println("Hello "+Arrays.asList(args)); } };
		 */
	}

}
