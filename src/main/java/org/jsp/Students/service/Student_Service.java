package org.jsp.Students.service;


import java.util.List;

import org.jsp.Students.dao.StudentDao;
import org.jsp.Students.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {
	
	@Autowired
	StudentDao dao;

	public ResponseEntity<Student> saveStudent(Student std) {
		double percentage = (std.getMathematics() + std.getScience() + std.getEnglish());
		std.setPercentage(percentage);

		if (std.getMathematics() < 35 || std.getScience() < 35 || std.getEnglish() < 35 || percentage < 35) {
			std.setResult("Your Result is Fail");
		} else {
			if (percentage < 60) {
				std.setResult("Second class");
			} else if (percentage < 85) {
				std.setResult("First class");
			} else {
				std.setResult("Distiction");
			}
		}
		dao.saveStudent(std);
		return new ResponseEntity<Student>(dao.saveStudent(std),HttpStatus.CREATED);
		
		}
		public ResponseEntity<List<Student>> getStudents()
		{
			List<Student> students=dao.getStudents();
			if(students.isEmpty())
				return new ResponseEntity<List<Student>>(students,HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<List<Student>>(students,HttpStatus.FOUND);
		}
		
		public ResponseEntity<Student> getById(int id)
		{
			Student student=dao.getById();
			if(student==null)
				return new ResponseEntity<Student>(student,HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<Student>(student,HttpStatus.FOUND);
		}
	}


