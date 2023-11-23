package com.ron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ron.service.IPurchaseOrder;

@SpringBootApplication
public class BootProj32SpringRestJavaMailApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(BootProj32SpringRestJavaMailApplication.class, args);
	
	IPurchaseOrder order = context.getBean(IPurchaseOrder.class);
	try {
		order.purchase(new String[] {"SmartWatch", "Shoes", "Shirts"}, 
						new double[] {5000,3000,1000},
						new String[] {"salvesubscribe@gmail.com"} );
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
