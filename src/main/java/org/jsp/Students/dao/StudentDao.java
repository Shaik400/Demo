package org.jsp.Students.dao;

import java.util.List;

import org.jsp.Students.dto.Student;
import org.jsp.Students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDao {
	
	@Autowired
	StudentRepository repository;

	public Student saveStudent(Student std) {
		return repository.save(std);
		
	}
	public List<Student> getStudents()
	{
		return repository.findAll();
		}
	public Student getBtId(int id) {
	return repository.findById(id).orElse(null);
}
	public Student getById() {
		// TODO Auto-generated method stub
		return null;
	}
}
