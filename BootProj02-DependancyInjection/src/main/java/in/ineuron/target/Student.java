package in.ineuron.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import in.ineuron.dependent.IStudentCourse;

@Component
@Scope("prototype")

public class Student {
	@Autowired
	@Qualifier("courseId")
	private IStudentCourse courseMaterial;
	
	public void preparationOfExam() {
			System.out.println("Preparation started for Exam");
			
			courseMaterial.courseContent();
			courseMaterial.courseFees();
	}

}
