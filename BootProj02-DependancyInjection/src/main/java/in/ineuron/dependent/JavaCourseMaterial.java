package in.ineuron.dependent;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "java")

@Scope("prototype")
public class JavaCourseMaterial implements IStudentCourse {

	@Override
	public String courseContent() {
		System.out.println("JavaCourseMaterial.courseContent()");
		return null;
	}

	@Override
	public Integer courseFees() {
		System.out.println("JavaCourseMaterial.courseFees()");
		return null;
	}

}
