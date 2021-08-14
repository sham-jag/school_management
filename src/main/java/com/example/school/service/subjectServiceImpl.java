package com.example.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.subjectDao;
import com.example.school.entity.Subject;
@Service
public class subjectServiceImpl implements subjectService {
	
	@Autowired
	private subjectDao SubjectDao;
	
	public subjectServiceImpl() {
	}

	@Override
	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return SubjectDao.findAll();
	}

	@Override
	public Subject getSubject(int parseInt) {
		return SubjectDao.getById(parseInt);
	}

	@Override
	public Subject addSubject(Subject subject) {
		SubjectDao.save(subject);
		return subject;
	}

	@Override
	public Subject updateSubject(Subject subject) {
		SubjectDao.save(subject);
		return subject;
	}
	
	@Override
	public void deleteSubject(int parseInt) {
		Subject entity = SubjectDao.getById(parseInt);
		SubjectDao.delete(entity);
	}
	
	
}
