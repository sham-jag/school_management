package com.example.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.teacherDao;
import com.example.school.entity.Teacher;
@Service
public class teacherServiceImpl implements teacherService {
	
	@Autowired
	private teacherDao TeacherDao;
	
	public teacherServiceImpl() {
	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return TeacherDao.findAll();
	}

	@Override
	public Teacher getTeacher(int parseInt) {
		return TeacherDao.getById(parseInt);
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		TeacherDao.save(teacher);
		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		TeacherDao.save(teacher);
		return teacher;
	}
	
	@Override
	public void deleteTeacher(int parseInt) {
		Teacher entity = TeacherDao.getById(parseInt);
		TeacherDao.delete(entity);
	}
	
	
}
