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

import com.example.school.entity.Teacher;
import com.example.school.service.teacherService;

@RestController
public class teacherController {
	
	@Autowired
	private teacherService TeacherService;


	//get all student details
	@GetMapping("/teachers")
	public List<Teacher> getTeachers(){
		
		return this.TeacherService.getTeachers();
	}
	
	//get one student details
	@GetMapping("/teachers/{teacherId}")
	public ResponseEntity<HttpStatus> getTeacher(@PathVariable String teacherId) {

		try {
			this.TeacherService.getTeacher(Integer.parseInt(teacherId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	//add one student
	@PostMapping("/teachers")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return this.TeacherService.addTeacher(teacher);
	}
	
	//update one student detail
	@PutMapping("/teachers")
	public Teacher updateTeachert(@RequestBody Teacher teacher) {
		return this.TeacherService.updateTeacher(teacher);
		
	}
	
	//delete one student
	@DeleteMapping("/teachers/{teacherId}")
	public ResponseEntity<HttpStatus> deleteTeacher(@PathVariable String teacherId){
		try {
			this.TeacherService.deleteTeacher(Integer.parseInt(teacherId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
