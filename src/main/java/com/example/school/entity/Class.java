package com.example.school.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="class")
public class Class {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String section;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_id", referencedColumnName="id")
    private Teacher teacher;
    
    @OneToMany(mappedBy="class", cascade=CascadeType.ALL)
    List<Student> student;
    
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Class(int id, String section, Teacher teacher) {
		super();
		this.id = id;
		this.section = section;
		this.teacher = teacher;
	}

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher_id(Teacher teacher) {
		this.teacher=teacher;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", section=" + section + ", teacher=" + teacher + "]";
	}


}
