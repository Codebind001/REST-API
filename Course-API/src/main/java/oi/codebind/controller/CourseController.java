package oi.codebind.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oi.codebind.course.model.Course;
import oi.codebind.course.model.CourseService;
import oi.codebind.dao.CourseRepo;
import oi.codebind.topic.model.Topic;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepo repo;
	
	@Autowired
	CourseService obj_service;
	
	@RequestMapping("/topic/{topicId}/courses")
	public List<Course> getCourses(@PathVariable String topicId) {
		return obj_service.getAllCourse(topicId);
	}
	
	@RequestMapping("/topic/{topicId}/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return repo.findById(id);
	}
	
	@PostMapping("/topic/{topicId}/courses")
	public Course saveCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		repo.save(course);
		return course;
	}
	
	
	@PutMapping("/topic/{topicId}/courses/{id}")
	public Course saveOrUpdateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId,"",""));
		repo.save(course);
		return course;
	}
}
