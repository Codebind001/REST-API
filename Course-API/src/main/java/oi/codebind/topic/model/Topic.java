package oi.codebind.topic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String des;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String des) {
		super();
		this.id = id;
		this.name = name;
		this.des = des;
	}
	public String getT_id() {
		return id;
	}
	public void setT_id(String id) {
		this.id = id;
	}
	public String getT_name() {
		return name;
	}
	public void setT_name(String name) {
		this.name = name;
	}
	public String getT_des() {
		return des;
	}
	public void setT_des(String des) {
		this.des = des;
	}

	@Override
	public String toString() {
		return "Topic [t_id=" + id + ", t_name=" + name + ", t_des=" + des + "]";
	}
	
	

}
