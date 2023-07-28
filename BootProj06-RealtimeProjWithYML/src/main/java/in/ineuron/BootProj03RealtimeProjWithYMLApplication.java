package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.controller.IEmpController;
import in.ineuron.vo.EmployeeVO;

@SpringBootApplication
public class BootProj03RealtimeProjWithYMLApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootProj03RealtimeProjWithYMLApplication.class, args);
	
	IEmpController controller = null;
	controller = context.getBean("controller",IEmpController.class);
	
	List<EmployeeVO> employees = null;
	
	employees = controller.displayAllRecords();
	employees.forEach(System.out::println);
	
	}

}
