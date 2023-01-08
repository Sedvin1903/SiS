package com.example.SiS.service;

import java.util.List;

import com.example.SiS.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}
