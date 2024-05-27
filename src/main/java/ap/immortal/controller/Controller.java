package ap.immortal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ap.immortal.model.Student;

@RestController
@RequestMapping("/v1")
public class Controller {
	
	@GetMapping("/hello")
	public String greeting() {
		return "<h1> Wellcome to Spring-Boot REST API-CRUD Project...</h1>";
	}
	
	@GetMapping("/api/students")
	public List<Student> getStudents(){
		List<Student>  list = new ArrayList<>();
		list.add(new Student("Amar", "Pujari"));
		list.add(new Student("Avi", "Pujari"));
		list.add(new Student("Amit", "Pujari"));
		
		return list;		
	}

}
