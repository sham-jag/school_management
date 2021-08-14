package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	
    private String student_fname;
    private String student_lname;
    private String dob;
    private String phone;
    private String address;
    private String gender;
    private int class_id;
    
	public Student(int student_id, String student_fname, String student_lname, String dob, String phone,
			String address, String gender, int class_id) {
		super();
		this.student_id = student_id;
		this.student_fname = student_fname;
		this.student_lname = student_lname;
		this.dob = dob;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.class_id = class_id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_fname() {
		return student_fname;
	}

	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}

	public String getStudent_lname() {
		return student_lname;
	}

	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
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

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_fname=" + student_fname + ", student_lname="
				+ student_lname + ", dob=" + dob + ", phone=" + phone + ", address=" + address + ", gender=" + gender
				+ ", class_id=" + class_id + "]";
	}

}
