package in.ineuron;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.employee.Employee;

@SpringBootApplication
public class BootProj05CollectionInConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext  context =  SpringApplication.run(BootProj05CollectionInConfigurationPropertiesApplication.class, args);
	
		Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp);
		
		((ConfigurableApplicationContext)context).close();
	}

}
