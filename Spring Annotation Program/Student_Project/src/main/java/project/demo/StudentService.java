package project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//creates both objects
//it injects dependency automaticallu
//manage the lifecycle

@Component

public class StudentService {
	
	private final StudentRepository repo;
	
	
	@Autowired // It tells the spring where the dependency injection is required here
	public StudentService(StudentRepository repo) { // Constructor - Dependency Injection
		
		this.repo = repo;
	}
	
	public void displayStudent() {
		System.out.println("Student Name: "+repo.getStudentName());
	}


}
