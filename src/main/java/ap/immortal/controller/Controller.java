package ap.immortal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ap.immortal.model.Student;

@RestController
@RequestMapping("/v1/api")
public class Controller {
	
	@GetMapping("/hello")
	public String greeting() {
		return "<h1> Wellcome to Spring-Boot REST API-CRUD Project...</h1>";
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student>  list = new ArrayList<>();
		list.add(new Student("Amar", "Pujari"));
		list.add(new Student("Avi", "Pujari"));
		list.add(new Student("Amit", "Pujari"));
		
		return list;		
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudentById(@PathVariable Integer studentId) {
		//TODO: need to implement Code		
		return new Student("Mathew", "Poaul");	
	}
	
	//TODO:  need to change implementations with actual database
	@PostMapping("/student/add")
	public void addStudent(@RequestBody Student student) {
		List<Student>  list = new ArrayList<Student>();
		list.add(student);
		System.out.println("Added Student in list Succesfully "+list.toString());		
	}

}
