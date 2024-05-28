package ap.immortal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ap.immortal.exception.StudentNotFoundException;
import ap.immortal.model.Student;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/v1/api")
public class StudentRESTController {
	
	private List<Student> list;
	
	@GetMapping("/hello")
	public String greeting() {
		return "<h1> Wellcome to Spring-Boot REST API-CRUD Project...</h1>";
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){		
		return list;		
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable Integer studentId) {
		//TODO: need to implement Code	
		if(studentId >= list.size() || studentId < 0) {
			throw new StudentNotFoundException("Student Not Found for id : "+studentId);
		}
		return list.get(studentId);	
	}
	
	//TODO:  need to change implementations with actual database
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		list.add(student);
		System.out.println("Added Student in list Succesfully "+list.toString());		
	}
	
	@PostConstruct
	void getStudentData() {
		list = new ArrayList<>();
		list.add(new Student("Amar", "Glen"));
		list.add(new Student("Avi", "Maxen"));
		list.add(new Student("Amit", "Nayar"));
	}	

}
