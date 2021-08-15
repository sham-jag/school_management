package com.example.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String fname;
    private String lname;
    private String phone;
    private String address;
    private String gender;
    private int subject_id;
    
	public Teacher(int id, String fname, String lname, String dob, String phone,
			String address, String gender, int subject_id) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.subject_id = subject_id;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfname() {
		return fname;
	}

	public void setfname(String fname) {
		this.fname = fname;
	}

	public String getlname() {
		return lname;
	}

	public void setlname(String lname) {
		this.lname = lname;
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
		return "Teacher [id=" + id + ", fname=" + fname + ", lname="
				+ lname + ", phone=" + phone + ", address=" + address + ", gender=" + gender
				+ ", subject_id=" + subject_id + "]";
	}

}
