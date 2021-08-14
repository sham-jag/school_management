package com.example.school.service;

import java.util.List;

import com.example.school.entity.Teacher;

public interface teacherService {
	
	public List<Teacher> getTeachers();
	
	public Teacher getTeacher(int parseInt);
	
	public Teacher addTeacher(Teacher teacher);
	
	public Teacher updateTeacher(Teacher teacher);
	
	public void deleteTeacher(int parseInt);

}
