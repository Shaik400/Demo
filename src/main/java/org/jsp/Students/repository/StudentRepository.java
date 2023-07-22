package org.jsp.Students.repository;

import java.util.List;

import org.jsp.Students.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{
}
