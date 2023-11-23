package com.ron;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ron.service.ERailClientApp;


@SpringBootApplication
public class BootProj23SpringRestWebClientConsumerAppApplication {

	public static void main(String[] args) {
		ApplicationContext context =	SpringApplication.run(BootProj23SpringRestWebClientConsumerAppApplication.class, args);
	
		ERailClientApp bean = context.getBean("service",ERailClientApp.class);
		
		bean.invokeRestApi();
		
		((ConfigurableApplicationContext) context).close();
		
	}

}
