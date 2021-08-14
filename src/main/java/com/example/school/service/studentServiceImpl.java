package com.example.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.studentDao;
import com.example.school.entity.Student;
@Service
public class studentServiceImpl implements studentService {
	
	@Autowired
	private studentDao StudentDao;
	
	public studentServiceImpl() {
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return StudentDao.findAll();
	}

	@Override
	public Student getStudent(int parseInt) {
		return StudentDao.getById(parseInt);
	}

	@Override
	public Student addStudent(Student student) {
		StudentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		StudentDao.save(student);
		return student;
	}
	
	@Override
	public void deleteStudent(int parseInt) {
		Student entity = StudentDao.getById(parseInt);
		StudentDao.delete(entity);
	}
	
	
}
