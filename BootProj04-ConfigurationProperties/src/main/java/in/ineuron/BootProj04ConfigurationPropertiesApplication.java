package in.ineuron;

import java.io.Closeable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.company.Comp1;
import in.ineuron.company.Comp2;
import in.ineuron.company.Comp4;
import in.ineuron.company.Company;

@SpringBootApplication
public class BootProj04ConfigurationPropertiesApplication {

	public static void main(String[] args) {
	ApplicationContext	context =   SpringApplication.run(BootProj04ConfigurationPropertiesApplication.class, args);
	
	Company com =  context.getBean(Company.class);
	System.out.println(com);

	Comp1 com1 =  context.getBean(Comp1.class);
	System.out.println(com1);
	
	Comp2 com2 =  context.getBean(Comp2.class);
	System.out.println(com2);
	
	Comp4 com4 = context.getBean(Comp4.class);
	System.out.println(com4);
	
	((ConfigurableApplicationContext)context).close();
	
	}

}
