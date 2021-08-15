package com.example.school.service;

import java.util.List;

import com.example.school.entity.Class;

public interface ClassService {
	
	public List<Class> getClasss();
	
	public Class getClass(int parseInt);
	
	public Class addClass(Class cl);
	
	public Class updateClass(Class cl);
	
	public void deleteClass(int parseInt);

}
