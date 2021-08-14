package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	private int subject_id;
    private String subject_name;
    private int teacher_id;
    
	public Subject(int subject_id, String subject_name, int teacher_id) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	@Override
	public String toString() {
		return "Subject [subject_id=" + subject_id + ", subject_name=" + subject_name + "]";
	}


}
