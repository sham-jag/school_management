package com.example.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.SubjectDao;
import com.example.school.entity.Subject;
@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	private SubjectDao subjectDao;
	
	public SubjectServiceImpl() {
	}

	@Override
	public List<Subject> getSubjects() {
		// TODO Auto-generated method stub
		return subjectDao.findAll();
	}

	@Override
	public Subject getSubject(int id) {
		return subjectDao.findById(id).get();
	}

	@Override
	public Subject addSubject(Subject subject) {
		subjectDao.save(subject);
		return subject;
	}

	@Override
	public Subject updateSubject(Subject subject) {
		subjectDao.save(subject);
		return subject;
	}
	
	@Override
	public void deleteSubject(int parseInt) {
		Subject entity = subjectDao.getById(parseInt);
		subjectDao.delete(entity);
	}
	
	
}
