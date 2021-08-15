package com.example.school.service;

import java.util.List;

import com.example.school.entity.Subject;

public interface SubjectService {
	
	public List<Subject> getSubjects();
	
	public Subject getSubject(int parseInt);
	
	public Subject addSubject(Subject subject);
	
	public Subject updateSubject(Subject subject);
	
	public void deleteSubject(int parseInt);

}
