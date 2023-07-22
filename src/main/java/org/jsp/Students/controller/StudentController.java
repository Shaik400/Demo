package org.jsp.Students.controller;

import org.jsp.Students.dto.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@PostMapping("/students")
	public ResponseEntity<String> saveStudent(Student std){
		s
	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>>getStudents(){
		return service.get
	}

}
