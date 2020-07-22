package oi.codebind.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.codebind.topic.model.Topic;

public interface TopicRepo extends JpaRepository<Topic, String>{

}
