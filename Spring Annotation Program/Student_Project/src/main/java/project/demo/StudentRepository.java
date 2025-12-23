package project.demo;

import org.springframework.stereotype.Component;

@Component // Creates the object using spring // if we declare this it considered as a Spring bean - XML configuration

public class StudentRepository {

	
	public String getStudentName() {
		return "Shakespear";
	}
	
}
