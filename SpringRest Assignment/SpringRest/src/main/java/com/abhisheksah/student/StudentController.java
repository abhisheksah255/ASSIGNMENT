package com.abhisheksah.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Abhishek", "kumar Sah", 23);
	}

	@GetMapping("/studentlist")
	public List<Student> getStudentlist(){
		
		List<Student> data=new ArrayList<>();
		data.add(getStudent());
		data.add(new Student("Nikhil", "Yadev", 18));
		data.add(new Student("Vishwa", "Yadev", 21));
		data.add(new Student("Ganesh", "Kumar", 31));
		data.add(new Student("Anshu", "Tiwari", 28));
		data.add(new Student("Aniket", "Mishra", 20));
		return data ;
		
	}

@GetMapping("student/{firstName}/{lastName}/{age}/")	
public Student studentPathVariable(@PathVariable("firstName") String firstName,
		@PathVariable("lastName") String lastName,
		@PathVariable("age") int age) {
	return new Student(firstName, lastName, age);
	
}
//@GetMapping("/student/{firstName}")
//public Student getbyname(@PathVariable String firstname
//		@RequestBody Student student) {
//	return new Student(student);
//}

//build rest API to handle query parameters
//http://localhost:8080/student?firstName=Abhishek&lastName=Sah




}


