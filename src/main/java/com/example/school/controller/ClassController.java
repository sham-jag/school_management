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
import com.example.school.service.ClassService;

@RestController
public class ClassController {
	
	@Autowired
	private ClassService classService;


	//get all student details
	@GetMapping("/classes")
	public List<Class> getClasses(){
		
		return this.classService.getClasses();
	}
	
	//get one student details
	@GetMapping("/classes/{classId}")
	public Class getClass(@PathVariable String classId) {

	
			return this.classService.getClass(Integer.parseInt(classId));
		
	}
	
	//add one student
	@PostMapping("/classes")
	public Class addClass(@RequestBody Class cl) {
		return this.classService.addClass(cl);
	}
	
	//update one student detail
	@PutMapping("/classes")
	public Class updateClasst(@RequestBody Class cl) {
		return this.classService.updateClass(cl);
		
	}
	
	//delete one student
	@DeleteMapping("/classes/{classId}")
	public ResponseEntity<HttpStatus> deleteClass(@PathVariable String classId){
		try {
			this.classService.deleteClass(Integer.parseInt(classId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
