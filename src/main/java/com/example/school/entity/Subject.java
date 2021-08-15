package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String subject_name;
    
	public Subject(int id, String subject_name) {
		super();
		this.id = id;
		this.subject_name = subject_name;
		
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubject_id() {
		return id;
	}

	public void setSubject_id(int subject_id) {
		this.id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	@Override
	public String toString() {
		return "Subject [subject_id=" + id + ", subject_name=" + subject_name + "]";
	}


}
