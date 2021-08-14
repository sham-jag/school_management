package com.example.school.service;

import java.util.List;

import com.example.school.entity.Student;

public interface studentService {
	
	public List<Student> getStudents();
	
	public Student getStudent(int parseInt);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(int parseInt);

}
