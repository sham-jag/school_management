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

import com.example.school.entity.Class;
import com.example.school.service.classService;

@RestController
public class classController {
	
	@Autowired
	private classService ClassService;


	//get all student details
	@GetMapping("/classes")
	public List<Class> getClasss(){
		
		return this.ClassService.getClasss();
	}
	
	//get one student details
	@GetMapping("/classes/{classId}")
	public ResponseEntity<HttpStatus> getClass(@PathVariable String classId) {

		try {
			this.ClassService.getClass(Integer.parseInt(classId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	//add one student
	@PostMapping("/classes")
	public Class addClass(@RequestBody Class cl) {
		return this.ClassService.addClass(cl);
	}
	
	//update one student detail
	@PutMapping("/classes")
	public Class updateClasst(@RequestBody Class cl) {
		return this.ClassService.updateClass(cl);
		
	}
	
	//delete one student
	@DeleteMapping("/classes/{classId}")
	public ResponseEntity<HttpStatus> deleteClass(@PathVariable String classId){
		try {
			this.ClassService.deleteClass(Integer.parseInt(classId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
