package com.example.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.dao.classDao;
import com.example.school.entity.Class;
@Service
public class classServiceImpl implements classService {
	
	@Autowired
	private classDao ClassDao;
	
	public classServiceImpl() {
	}

	@Override
	public List<Class> getClasss() {
		// TODO Auto-generated method stub
		return ClassDao.findAll();
	}

	@Override
	public Class getClass(int parseInt) {
		return ClassDao.getById(parseInt);
	}

	@Override
	public Class addClass(Class cl) {
		ClassDao.save(cl);
		return cl;
	}

	@Override
	public Class updateClass(Class cl) {
		ClassDao.save(cl);
		return cl;
	}
	
	@Override
	public void deleteClass(int parseInt) {
		Class entity = ClassDao.getById(parseInt);
		ClassDao.delete(entity);
	}
	
	
}
