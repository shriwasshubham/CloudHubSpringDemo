package com.java.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springrest.dao.CloudHubDao;
import com.java.springrest.entities.Course;

@Service
public class CloudHubService {
	
	@Autowired
	private CloudHubDao cloudHubDao;
		
	public CloudHubService() {
		
	}
	
	public List<Course> getCourses(){
		return cloudHubDao.findAll();
	}

	public Course addStudent(Course enrollment) {
		return cloudHubDao.save(enrollment);
	}
}
