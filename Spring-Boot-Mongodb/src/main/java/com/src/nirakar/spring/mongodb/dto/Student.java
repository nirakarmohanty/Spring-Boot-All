package com.src.nirakar.spring.mongodb.dto;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document(collection  = "student")
public class Student {
	
	@Id
	private String id;
	
	private String name;
	
	private String batch;
	
	@Field(name = "mailId")
	private String email;
	
	private CourseDetails courseDetails;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", batch=" + batch + ", email=" + email + ", courseDetails="
				+ courseDetails + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CourseDetails getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(CourseDetails courseDetails) {
		this.courseDetails = courseDetails;
	}

}
