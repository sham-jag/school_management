package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	private int teacher_id;
    private String teacher_fname;
    private String teacher_lname;
    private String dob;
    private String phone;
    private String address;
    private String gender;
    private int subject_id;
    
	public Teacher(int teacher_id, String teacher_fname, String teacher_lname, String dob, String phone,
			String address, String gender, int subject_id) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_fname = teacher_fname;
		this.teacher_lname = teacher_lname;
		this.dob = dob;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.subject_id = subject_id;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_fname() {
		return teacher_fname;
	}

	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
	}

	public String getTeacher_lname() {
		return teacher_lname;
	}

	public void setTeacher_lname(String teacher_lname) {
		this.teacher_lname = teacher_lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_fname=" + teacher_fname + ", teacher_lname="
				+ teacher_lname + ", dob=" + dob + ", phone=" + phone + ", address=" + address + ", gender=" + gender
				+ ", subject_id=" + subject_id + "]";
	}

}
