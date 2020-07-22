package oi.codebind.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oi.codebind.dao.TopicRepo;
import oi.codebind.topic.model.Topic;

@RestController
public class TopicController {
	
	@Autowired
	TopicRepo repo;
	
	@RequestMapping("/topics")
	public List<Topic> getCourses() {
		return repo.findAll();
	}
	
	@RequestMapping("/topic/{id}")
	public Optional<Topic> getCourse(@PathVariable String id) {
		return repo.findById(id);
	}
	
	
	@PostMapping("/topic")
	public Topic saveCourse(@RequestBody Topic topic) {
		repo.save(topic);
		return topic;
	}
	
	@PutMapping("/topic/{id}")
	public Topic saveOrUpdateCourse(@RequestBody Topic topic, @PathVariable String id) {
		repo.save(topic);
		return topic;
	}
	
	@DeleteMapping("/topic/{id}")
	public String dalete(@PathVariable String id) {
		repo.deleteById(id);
		return "deleted";
	}
}
