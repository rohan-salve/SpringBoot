package in.ineuron.dependent;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "CSharp")
@Scope("prototype")

public class CSharpCourseMaterial implements IStudentCourse {

	@Override
	public String courseContent() {
		System.out.println("CSharpCourseMaterial.courseContent()");
		return null;
	}

	@Override
	public Integer courseFees() {
		System.out.println("CSharpCourseMaterial.courseFees()");
		return null;
	}

}
