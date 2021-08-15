package com.example.school.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.school.service.StudentService;
import com.example.school.service.TeacherService;

@Component
public class ReportGenerator {

	private Logger logger = LoggerFactory.getLogger(ReportGenerator.class);
	
	@Autowired
	private StudentService s;
	
	@Autowired
	private TeacherService t;
	
	
	@Scheduled(cron = "0 * * ? * *")
	public void generateReport() {
		logger.info("***************  REPORT ***************");
		logger.info("Total teachers : " + t.getTeachers().size());
		logger.info("Total students : " + s.getStudents().size());
	}
}
