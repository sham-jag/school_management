package com.example.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.TeacherDao;
import com.example.school.entity.Teacher;
@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherDao teacherDao;
	
	public TeacherServiceImpl() {
	}

	@Override
	public List<Teacher> getTeachers() {
		// TODO Auto-generated method stub
		return teacherDao.findAll();
	}

	@Override
	public Teacher getTeacher(int id) {
		return teacherDao.findById(id).get();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		teacherDao.save(teacher);
		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		teacherDao.save(teacher);
		return teacher;
	}
	
	@Override
	public void deleteTeacher(int id) {
		Teacher entity = teacherDao.getById(id);
		teacherDao.delete(entity);
	}
	
	
}
