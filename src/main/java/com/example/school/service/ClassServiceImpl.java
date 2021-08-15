package com.example.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.ClassDao;
import com.example.school.entity.Class;
@Service
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	private ClassDao classDao;
	
	public ClassServiceImpl() {
	}

	@Override
	public List<Class> getClasses() {
		// TODO Auto-generated method stub
		return classDao.findAll();
	}

	@Override
	public Class getClass(int id) {
		return classDao.findById(id).get();
	}

	@Override
	public Class addClass(Class cl) {
		classDao.save(cl);
		return cl;
	}

	@Override
	public Class updateClass(Class cl) {
		classDao.save(cl);
		return cl;
	}
	
	@Override
	public void deleteClass(int parseInt) {
		Class entity = classDao.getById(parseInt);
		classDao.delete(entity);
		
	}
	
	
}
