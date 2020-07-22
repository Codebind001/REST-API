package oi.codebind.course.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import oi.codebind.topic.model.Topic;

@Entity
public class Course {
	
	@Id
	private String C_id;
	private String C_name;
	private String C_description;
	@ManyToOne
	private Topic topic;
	

	public Course() {
		    
	}
	
	public Course(String c_id, String c_name, String c_description, String topicId) {
		super();
		C_id = c_id;
		C_name = c_name;
		C_description = c_description;
		this.topic = new Topic(topicId,"","");
	}
	
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getC_description() {
		return C_description;
	}
	public void setC_description(String c_description) {
		C_description = c_description;
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
