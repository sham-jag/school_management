package com.example.school.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String student_fname;
    private String student_lname;
    private String dob;
    private String phone;
    private String address;
    private String gender;
    @ManyToOne(cascade= {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="clas_id")
    private Class cl;
    
    
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date date_of_birth = null;
	try {
	date_of_birth=sdf.parse(this.dob);
	}
	catch(ParseException e) {
		e.printStackTrace();
	}
	
	sdf=new SimpleDateFormat("dd/MM/yyyy");
	String student_dob=sdf.format(date_of_birth);

    
	public Student(int student_id, String student_fname, String student_lname, String dob, String phone,
			String address, String gender, Class cl) {
		super();
		this.id = student_id;
		this.student_fname = student_fname;
		this.student_lname = student_lname;
		this.dob = dob;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.cl = cl;
	}
//	
//	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//	Date date_of_birth = null;
//	try {
//	date_of_birth=sdf.parse(this.dob);
//	}
//	catch(ParseException e) {
//		e.printStackTrace();
//	}
//	
//	sdf=new SimpleDateFormat("dd/MM/yyyy");
//	String student_dob=sdf.format(date_of_birth);


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudent_id() {
		return id;
	}

	public void setStudent_id(int student_id) {
		this.id = student_id;
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
		return student_dob;
	}

	public void setDob(String dob) {
		this.dob = student_dob;
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

	public Class getCl() {
		return cl;
	}

	public void setCl(Class cl) {
		this.cl = cl;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", student_fname=" + student_fname + ", student_lname=" + student_lname + ", dob="
				+ student_dob + ", phone=" + phone + ", address=" + address + ", gender=" + gender + ", cl=" + cl + "]";
	}



}
