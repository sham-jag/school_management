package com.example.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.StudentDao;
import com.example.school.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(int parseInt) {
		return studentDao.getById(parseInt);
	}

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student);
		return student;
	}
	
	@Override
	public void deleteStudent(int parseInt) {
		Student entity = studentDao.getById(parseInt);
		studentDao.delete(entity);
	}
	
	
}
