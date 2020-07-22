package oi.codebind.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.codebind.course.model.Course;

public interface CourseRepo extends JpaRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);

}
