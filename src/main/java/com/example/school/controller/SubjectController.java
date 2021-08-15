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

import com.example.school.entity.Subject;
import com.example.school.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;


	//get all student details
	@GetMapping("/subjects")
	public List<Subject> getSubjects(){
		
		return this.subjectService.getSubjects();
	}
	
	//get one student details
	@GetMapping("/subjects/{subjectId}")
	public Subject getSubject(@PathVariable String subjectId) {

//		try {
			Subject subject =  this.subjectService.getSubject(Integer.parseInt(subjectId));
			return subject;
//			return new ResponseEntity<>(HttpStatus.OK);
//		}
//		catch(Exception e) {
////			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//			return new Subject();
//		}

	}
	
	//add one student
	@PostMapping("/subjects")
	public Subject addSubject(@RequestBody Subject subject) {
		return this.subjectService.addSubject(subject);
	}
	
	//update one student detail
	@PutMapping("/subjects")
	public Subject updateSubjectt(@RequestBody Subject subject) {
		return this.subjectService.updateSubject(subject);
		
	}
	
	//delete one student
	@DeleteMapping("/subjects/{subjectId}")
	public ResponseEntity<HttpStatus> deleteSubject(@PathVariable String subjectId){
		try {
			this.subjectService.deleteSubject(Integer.parseInt(subjectId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
