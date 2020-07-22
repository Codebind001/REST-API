package oi.codebind.course.model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oi.codebind.dao.CourseRepo;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepo repo;
	
	
	public List<Course> getAllCourse(String topicId){
		List<Course> course = new ArrayList<>();
		repo.findByTopicId(topicId).forEach(course::add);
		return course;
	}
	

}
