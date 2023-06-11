package com.java.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springrest.entities.Course;
import com.java.springrest.service.CloudHubService;

@RestController
public class CloudHubController {
	
	@Autowired
	private CloudHubService cloudHubService;
	
	@GetMapping("/courses")
	public List<Course> getEnrollmentList(){
		return this.cloudHubService.getCourses();
	}
	
	@PostMapping(path = "/courses", consumes = "application/json")
	public Course addStudent(@RequestBody  Course enroll) {
		return this.cloudHubService.addStudent(enroll);
	}
	
}
