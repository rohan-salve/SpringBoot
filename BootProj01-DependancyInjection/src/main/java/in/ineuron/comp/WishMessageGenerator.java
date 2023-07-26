package in.ineuron.comp;

	import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
//@Scope("prototype")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime date;
	
	static {
		System.out.println("WishMessageGenerator.enclosing_method() loading ");
	}
	public WishMessageGenerator() {

		System.out.println("WishMessageGenerator.WishMessageGenerator() Zero Paratmeter Contructor Loaded..");
	}
	
	//Business logic
	public String generateWishMessage(String user) {
		
			System.out.println("WishMessageGenerator.generateWishMessage()");
			
			int hour = date.getHour();
			String time;

			if(hour < 12) time = " Morning ";
			else if (hour < 16) time = " Afternoon ";
			else if(hour < 20) time = " Evening ";
			else time = " Night ";
			 
			return "Good"+time+user ;
	}
	
}
