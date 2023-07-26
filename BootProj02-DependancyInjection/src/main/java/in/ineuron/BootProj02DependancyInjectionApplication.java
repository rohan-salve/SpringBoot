package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import in.ineuron.target.Student;

@SpringBootApplication
@ImportResource("in/ineuron/cfg/ApplicationContext.XML")
public class BootProj02DependancyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context =		SpringApplication.run(BootProj02DependancyInjectionApplication.class, args);
		System.out.println("****Container Started****");
		Student studentExam = context.getBean(Student.class);
		
		studentExam.preparationOfExam();
		System.out.println("****Container PreDestroy****");
		((ConfigurableApplicationContext)context).close();
		
	}

}
