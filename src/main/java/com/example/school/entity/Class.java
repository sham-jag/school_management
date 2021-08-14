package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class {
	
	@Id
	private int class_id;
    private String section;
    private int teacher_id;
    
	public Class(int class_id, String section, int teacher_id) {
		super();
		this.class_id = class_id;
		this.section = section;
		this.teacher_id = teacher_id;
	}

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int subject_id) {
		this.teacher_id = subject_id;
	}

	@Override
	public String toString() {
		return "Class [class_id=" + class_id + ", section=" + section + ", teacher_id=" + teacher_id + "]";
	}


}
