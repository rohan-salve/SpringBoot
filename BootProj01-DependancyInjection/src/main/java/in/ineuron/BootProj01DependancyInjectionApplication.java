package in.ineuron;



import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependancyInjectionApplication {
	
	static {
		System.out.println("BootProj01DependancyInjectionApplication.enclosing_method()");
	}
	
	public BootProj01DependancyInjectionApplication() {
		System.out.println("BootProj01DependancyInjectionApplication.BootProj01DependancyInjectionApplication()");
	}
	
	
	@Bean
	LocalDateTime createLocalDateTimeObj() {
		System.out.println("BootProj01DependancyInjectionApplication.createLocalDateTimeObj()");
		
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootProj01DependancyInjectionApplication.class, args);
		
		System.out.println("BootProj01DependancyInjectionApplication.main()");
		
		System.out.println("Implemetation is provided by : "+ context.getClass().getName());
		System.out.println("*****Container Started*****");
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		String msg = wmg.generateWishMessage("Rohan");
		System.out.println(msg);
		
		context.close();
		
		System.out.println("****Container Stopped*****");
		
	}

}
