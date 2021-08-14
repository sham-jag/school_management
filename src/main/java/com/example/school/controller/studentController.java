package com.example.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.entity.Student;
import com.example.school.service.studentService;

@RestController
public class studentController {
	
	@Autowired
	private studentService StudentService;

	@GetMapping("/home")
	public String home() {
		return "Welcome!!";
	}
	
	//get all student details
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return this.StudentService.getStudents();
	}
	
	//get one student details
	@GetMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> getStudent(@PathVariable String studentId) {
//		return this.StudentService.getStudent(Integer.parseInt(studentId));
		
		try {
			this.StudentService.getStudent(Integer.parseInt(studentId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	//add one student
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return this.StudentService.addStudent(student);
	}
	
	//update one student detail
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		return this.StudentService.updateStudent(student);
		
	}
	
	//delete one student
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String studentId){
		try {
			this.StudentService.deleteStudent(Integer.parseInt(studentId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
